package designPattern.Proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class ProxyHandler implements InvocationHandler {
    private Star star;

    public ProxyHandler(Star star){
        this.star = star;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before real object……");
        Object object = method.invoke(star, args);
        System.out.println("end real object……");
        return object;
    }
}
