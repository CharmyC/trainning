package designPattern.factory;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class Client {
    public static void main(String[] args) {
        new FactoryA().create();
        new FactoryB().create();
        System.out.println("abstract factory");

        AbstractFactory factoryA = new AbstractFactorA();
        factoryA.createCar();
        factoryA.createProduct();
        AbstractFactory factoryB = new AbstractFactorA();
        factoryB.createCar();
        factoryB.createProduct();

    }
}
