package designPattern.Proxy;

import java.lang.reflect.Proxy;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Client {
    public static void main(String[] args) {
        StaticProxy proxy = new StaticProxy(new RealStart());
        proxy.sing();

        //
        ProxyHandler proxyHandler = new ProxyHandler(new RealStart());
        Star star = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, proxyHandler);
        star.sing();
        star.stop();

        CglibProxy cglibProxy = new CglibProxy();
        RealStart realStart = (RealStart) cglibProxy.getInstance(new RealStart());
        realStart.stop();
        realStart.sing();


    }
}
