package designPattern.builder;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder builder){
        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();
        return builder.buildPerson();
    }
}
