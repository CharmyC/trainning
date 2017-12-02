package designPattern.Bridge;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Client {
    public static void main(String[] args) {
        Computer c = new Laptop(new Lenovo());
        c.sale();

        Computer desktop = new Desktop(new Lenovo());
        desktop.sale();
    }
}
