package designPattern.state;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Context {
    private State state;

    public void request(State s){
        this.state = s;
        state.handle();
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.request(new FreeState());
    }

}
