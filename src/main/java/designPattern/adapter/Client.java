package designPattern.adapter;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        Target objectAdapter = new ObjectAdapter(new Adaptee());
        Target classAdapter = new ClassAdapter();
        target.request();
        objectAdapter.request();
        classAdapter.request();
    }
}
