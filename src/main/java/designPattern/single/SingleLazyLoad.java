package designPattern.single;

/**
 * 使用锁，线程安全，但是锁的性能开销比较大
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class SingleLazyLoad {
    private static SingleLazyLoad instance = null;
    private SingleLazyLoad(){

    }
    private static synchronized SingleLazyLoad getInstance(){
        if (null == instance){
            instance = new SingleLazyLoad();
        }
        return instance;
    }
}
