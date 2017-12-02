package designPattern.Mediator;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class Finacial extends Colleague {

    public Finacial(Mediator mediator) {
        super(mediator);
        this.mediator.register("finacial", this);
    }

    public void selfAction() {
        System.out.println("财务部：会计正在核对财务……");
    }

    public void outAction() {
        System.out.println("财务部向总经理说：钱很多，花不完.....");
    }
}
