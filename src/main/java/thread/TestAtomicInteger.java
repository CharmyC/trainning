package thread;

import javafx.concurrent.Task;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhuanli.cheng on 2017/12/6.
 */
public class TestAtomicInteger {
    private static int id = 0;
    public static synchronized int getNextId(){
        return ++ id;
    }

    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static int getNextIdAtomic(){
        return atomicInteger.getAndIncrement();
    }

    private static CountDownLatch countDownLatch = null;
    static class Task implements Runnable{
        private boolean isAtomic;

        public Task(boolean isAtomic){
            this.isAtomic = isAtomic;
        }

        public void run() {
            for (int i =0; i <1000; i++) {
                if (isAtomic) {
                    getNextIdAtomic();
                } else {
                    getNextId();
                }
            }
            countDownLatch.countDown();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        countDownLatch = new CountDownLatch(50);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50; i ++){
            new Thread(new Task(true)).start();
        }
        countDownLatch.await();
        System.out.println("atomic use times:" + (System.currentTimeMillis() - start));
        countDownLatch = new CountDownLatch(50);
        start = System.currentTimeMillis();
        for (int i =0; i < 50; i ++){
            new Thread(new Task(false)).start();
        }
        countDownLatch.await();
        System.out.println("use time :" + (System.currentTimeMillis() - start));
    }

}
