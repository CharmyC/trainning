package designPattern.Bridge;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Computer {
    private Brand brand;
    public Computer(Brand brand){
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
