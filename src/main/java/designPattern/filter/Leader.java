package designPattern.filter;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;
    public Leader(String name){
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LeaveRequest request);
}
