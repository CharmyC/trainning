package designPattern.strategy;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class RegisterUser implements Strategy {
    public double getDiscountPrice(double price) {
        System.out.println("普通会员：打8折");
        return price * 0.8;
    }
}
