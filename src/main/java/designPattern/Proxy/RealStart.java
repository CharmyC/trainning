package designPattern.Proxy;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class RealStart implements Star {
    public void sing() {
        System.out.println("real star sing");
    }

    public void stop() {
        System.out.println("real star stop");
    }
}
