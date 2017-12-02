package designPattern.filter;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Manger extends Leader {
    public Manger(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() > 3 && request.getLeaveDays() < 20){
            System.out.println("审批人：" + this.name);
        } else {
            System.out.println("请假不批准");
        }
    }
}
