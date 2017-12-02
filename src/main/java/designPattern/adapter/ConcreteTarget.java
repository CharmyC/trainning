package designPattern.adapter;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("concreteTarget:" + ConcreteTarget.class.getName());
    }
}
