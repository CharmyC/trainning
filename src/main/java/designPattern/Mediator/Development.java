package designPattern.Mediator;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class Development extends Colleague {
    private Mediator mediator;

    public Development(Mediator mediator) {
        super(mediator);
        mediator.register("development", this);
    }

    public void selfAction() {
        System.out.println("研发部:项目研发");
    }

    public void outAction() {
        System.out.println("项目经费短缺");
    }
}
