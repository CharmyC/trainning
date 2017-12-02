package designPattern.command;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class Client {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new ConcreteReceiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}
