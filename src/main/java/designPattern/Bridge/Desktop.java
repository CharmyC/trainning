package designPattern.Bridge;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale(){
        super.sale();
        System.out.println("台式机");
    }
}
