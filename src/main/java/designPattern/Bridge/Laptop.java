package designPattern.Bridge;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void sale(){
        super.sale();
        System.out.println("笔记本");
    }
}
