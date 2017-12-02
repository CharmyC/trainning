package designPattern.builder;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
