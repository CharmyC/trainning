package designPattern.state;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class CheckInState implements State {
    public void handle() {
        System.out.println("房间已入住");
    }
}
