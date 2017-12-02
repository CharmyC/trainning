package designPattern.factory;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class AbstarctFactoryB implements AbstractFactory {
    public Product createProduct() {
        return new ProductB();
    }

    public Car createCar() {
        return new CarB();
    }
}
