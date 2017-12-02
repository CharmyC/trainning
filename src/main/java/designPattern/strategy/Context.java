package designPattern.strategy;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void printPrice(double price){
        price = strategy.getDiscountPrice(price);
        System.out.println("应付金额：" + Math.round(price));
    }
}
