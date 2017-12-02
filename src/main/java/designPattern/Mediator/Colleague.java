package designPattern.Mediator;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void selfAction();
    public abstract void outAction();
}
