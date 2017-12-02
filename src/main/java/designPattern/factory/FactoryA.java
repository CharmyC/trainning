package designPattern.factory;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class FactoryA implements Factory {
    public Product create() {
        return new ProductA();
    }
}
