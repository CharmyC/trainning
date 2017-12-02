package designPattern.decorator;

/**
 * Created by zhuanli.cheng on 2017/11/12.
 */
public class ConcreteDecorator extends Decorator {
    private Component component;
    private String desc;

    public ConcreteDecorator(Component component, String desc) {
        this.component = component;
        this.desc = desc;
    }

    public double cost() {
        return 3.0 + this.component.cost();
    }

    public String getDescription() {
        return this.component.getDescription() + this.desc;
    }
}
