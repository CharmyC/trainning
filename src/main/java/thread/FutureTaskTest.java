package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by zhuanli.cheng on 2017/12/7.
 */
public class FutureTaskTest {
    static class CallableDemo implements Callable<Integer> {
        private int sum;
        public Integer call() throws Exception {
            System.out.println("Callable子线程开始计算啦！");
            Thread.sleep(2000);

            for(int i=0 ;i<5000;i++){
                sum=sum+i;
            }
            System.out.println("Callable子线程计算结束！");
            return sum;
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Integer> future = es.submit(new CallableDemo());
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new CallableDemo());
        futureTask.run();
        futureTask.run();
        futureTask.run();
        futureTask.run();
        es.shutdown();
        try {
            Thread.sleep(2000);
            System.out.println("主线程执行");
            if (null != future.get()){
                System.out.println("future :" + future.get());
            } else {
                System.out.println("未获取到查询结果");
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("future task:" + futureTask.get());
    }
}
