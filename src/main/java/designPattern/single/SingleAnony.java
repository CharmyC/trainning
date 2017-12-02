package designPattern.single;

/**
 * 使用静态内部类, 可以达到懒加载的效果，按需创建实例
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class SingleAnony {
    private SingleAnony(){

    }

    private static class SingleHolder{
        private final static SingleAnony instance = new SingleAnony();
    }

    public static SingleAnony getInstance(){
        return SingleHolder.instance;
    }

}
