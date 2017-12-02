package designPattern.strategy;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class GeneralUser implements Strategy{
    public double getDiscountPrice(double price) {
        System.out.println("普通用户，不打折");
        return price;
    }
}
