package designPattern.command;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.action();
    }
}
