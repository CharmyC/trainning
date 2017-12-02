package designPattern.Mediator;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class ConcreteMediator implements Mediator{
    private Map<String, Colleague> map = Maps.newHashMap();

    public void register(String name, Colleague department) {
        map.put(name, department);
    }

    //根据部门名称，想具体的部门下达命令
    public void command(String dname) {
        map.get(dname).selfAction();
    }

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Development development = new Development(mediator);
        development.selfAction();
        development.outAction();
    }
}
