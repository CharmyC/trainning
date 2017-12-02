package designPattern.adapter;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 */
public class ClassAdapter extends Adaptee implements Target{
    public void request() {
        super.specificRequest();
    }
}
