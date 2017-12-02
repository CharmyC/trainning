package designPattern.adapter;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}
