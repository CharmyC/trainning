package designPattern.decorator;

/**
 * Created by zhuanli.cheng on 2017/11/12.
 */
public abstract class Component {
    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
