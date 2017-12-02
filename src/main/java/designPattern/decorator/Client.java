package designPattern.decorator;

/**
 * Created by zhuanli.cheng on 2017/11/12.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent("compent");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent, " decorator");
        System.out.println(concreteDecorator.cost());
        System.out.println(concreteDecorator.getDescription());

    }
}
