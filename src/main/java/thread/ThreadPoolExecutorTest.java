package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhuanli.cheng on 2017/12/7.
 */
public class ThreadPoolExecutorTest {
    final BlockingQueue<Runnable> queue = new SynchronousQueue<Runnable>();
    final ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 600, 30, TimeUnit.SECONDS, queue,
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    final AtomicInteger completedTask = new AtomicInteger(0);
    final AtomicInteger rejectTask = new AtomicInteger(0);

    static long beginTime = 0;
    final int count = 1000;

    public void start(){
        CountDownLatch latch = new CountDownLatch(count);
        CyclicBarrier barrier = new CyclicBarrier(count);

        for (int i =0; i< count ; i ++){
            new Thread(new TestThread(latch, barrier)).start();
        }

        try {
            latch.await();
            executor.shutdown();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    class TestThread implements Runnable{
        private CountDownLatch countDownLatch;
        private CyclicBarrier cyclicBarrier;

        public TestThread(CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier) {
            this.countDownLatch = countDownLatch;
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            try {
                executor.execute(new Task(countDownLatch));
            } catch (RejectedExecutionException e){
                System.out.println("被拒绝任务数：" + rejectTask.incrementAndGet());
            }

        }
    }

    class Task implements Runnable{
        private CountDownLatch latch;

        public Task(CountDownLatch latch) {
            this.latch = latch;
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行任务数：" + completedTask.incrementAndGet());
            System.out.println("任务耗时：" + (System.currentTimeMillis() - beginTime));
            latch.countDown();
        }
    }

    public static void main(String[] args) {
        beginTime = System.currentTimeMillis();
        ThreadPoolExecutorTest executorTest = new ThreadPoolExecutorTest();
        executorTest.start();

    }

}
