package designPattern.command;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class ConcreteReceiver implements Receiver {
    public void action() {
        System.out.println("excute command");
    }
}
