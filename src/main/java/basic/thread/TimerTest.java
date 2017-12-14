package basic.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by zhuanli.cheng on 2017/12/14.
 */
public class TimerTest {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        }, 5000);

        new Thread(new Runnable() {
            public void run() {
                while (true){
                    System.out.println("running……");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
