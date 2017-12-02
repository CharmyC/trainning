package designPattern.Mediator;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public interface Mediator {
    void register(String name, Colleague department);
    void command(String dname);
}
