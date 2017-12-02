package designPattern.adapter;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 *  被适配者
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("adaptee:" + this.hashCode());
    }
}
