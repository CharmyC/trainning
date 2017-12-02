package designPattern.command;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
