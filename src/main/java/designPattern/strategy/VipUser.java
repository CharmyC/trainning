package designPattern.strategy;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class VipUser implements Strategy {
    public double getDiscountPrice(double price) {
        System.out.println("vip会员：打7折");
        return price * 0.7;
    }
}
