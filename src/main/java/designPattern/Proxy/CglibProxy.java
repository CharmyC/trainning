package designPattern.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class CglibProxy implements MethodInterceptor{
    private Object target;
    private Enhancer enhancer = new Enhancer();
    public Object getInstance(Object target){
        this.target = target;
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before Method");
        Object result = method.invoke(this.target, objects);
        System.out.println("after Method");
        return result;
    }
}
