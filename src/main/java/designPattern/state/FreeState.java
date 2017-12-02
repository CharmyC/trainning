package designPattern.state;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class FreeState implements State {
    public void handle() {
        System.out.println("空闲状态，可以预定");
    }
}
