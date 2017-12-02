package designPattern.filter;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("xiaozhang", 30, "生病");
        Leader director = new Director("xiaowang");
        Leader manger = new Manger("xiaoli");
        director.setNextLeader(manger);
        director.handleRequest(request);
    }
}
