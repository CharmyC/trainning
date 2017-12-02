package designPattern.state;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class BookedState implements State {
    public void handle() {
        System.out.println("房间已被预定");
    }
}
