package designPattern.single;

/**
 * 饿汉式，内存的应用率比较低
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class SingleHungry {
    private static SingleHungry instance = new SingleHungry();

    private SingleHungry(){

    }

    public static SingleHungry getInstance(){
        return instance;
    }


}
