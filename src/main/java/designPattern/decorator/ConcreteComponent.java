package designPattern.decorator;

/**
 * Created by zhuanli.cheng on 2017/11/12.
 */
public class ConcreteComponent extends Component {
    public ConcreteComponent(String name){
        this.description = name;
    }
    public double cost() {
        return 2.0;
    }
}
