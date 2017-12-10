package basic.thread;

/**
 * Created by zhuanli.cheng on 2017/12/6.
 */
public class TestSynchronized {
    /**
     * 锁住class对象
     */
    public void synchronizeClass(){
        synchronized (TestSynchronized.class){
            System.out.println("synchronizeClass");
            sleep(10000);
        }
    }

    /**
     * synchronized 作用在方法上
     */
    public synchronized void synchronizeMethod(){
        System.out.println("synchronized on method");
        sleep(10000);
    }


    public static synchronized void synchronizeStaticMethod(){
        System.out.println("synchronized on static method");
        sleep(10000);
    }

    public void synchronizeThis(){
        synchronized (TestSynchronized.this) {
            System.out.println("synchronzied this");
            sleep(10000);
        }
    }

    public void synchronizedThis2(){
        synchronized (this){
            System.out.println("synchronized this2");
            sleep(10000);
        }
    }


    public void noSynchronized(){
        System.out.println("no synchronized");
    }



    private static void sleep(long time){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final TestSynchronized test1 = new TestSynchronized();
        final TestSynchronized test2 = new TestSynchronized();

        Thread th = new Thread(new Runnable() {
            public void run() {
                test2.synchronizedThis2();
            }
        });
        th.start();
        th = new Thread(new Runnable() {
            public void run() {
                test2.synchronizeClass();
            }
        });
        th.start();
    }
}
