package designPattern.filter;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 3){
            System.out.println("审批人：" + this.name);
        } else {
            if (this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
