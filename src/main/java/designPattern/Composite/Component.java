package designPattern.Composite;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        super();
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
