package designPattern.single;

/**
 * 加同步锁时，前后两次判断实例是否存在, 可以用
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class SingleOpti {
    private static SingleOpti instance = null;
    private SingleOpti(){

    }

    public static SingleOpti getInstance(){
        if (null == instance) {
            synchronized (SingleOpti.class) {
                if (null == instance){
                    instance = new SingleOpti();
                }
            }
        }
        return instance;
    }
}
