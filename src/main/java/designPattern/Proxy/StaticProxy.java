package designPattern.Proxy;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class StaticProxy implements Star {
    Star star;

    StaticProxy(Star star){
        this.star = star;
    }

    public void sing(){
        star.sing();
    }

    public void stop() {
        star.stop();
    }
}
