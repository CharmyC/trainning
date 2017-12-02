package designPattern.factory;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class AbstractFactorA implements AbstractFactory {
    public Product createProduct() {
        return new ProductA();
    }

    public Car createCar() {
        return new CarA();
    }
}
