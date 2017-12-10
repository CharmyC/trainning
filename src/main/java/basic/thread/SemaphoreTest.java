package basic.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by zhuanli.cheng on 2017/12/7.
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 20; i ++ ){
            final int index = i;
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("Accessing: " + index);
                        Thread.sleep((long) (Math.random() * 10000));
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            es.execute(runnable);
        }
        es.shutdown();
    }
}
