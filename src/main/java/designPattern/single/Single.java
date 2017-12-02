package designPattern.single;

/**
 *  线程不安全
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class Single {
    private static Single instance = null;

    private Single(){

    }

    public static Single getInstance (){
        if (null == instance){
            instance = new Single();
        }
        return instance;
    }
}
