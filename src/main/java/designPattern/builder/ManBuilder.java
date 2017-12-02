package designPattern.builder;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class ManBuilder implements PersonBuilder {
    Person person;
    String type;
    public ManBuilder(Person person, String type){
        this.person = person;
        this.type = type;
    }
    public void buildHead() {
        person.setHead(this.type + " head");
    }

    public void buildBody() {
        person.setBody(this.type + " body");
    }

    public void buildFoot() {
        person.setFoot(this.type + " foot");
    }

    public Person buildPerson() {
        return person;
    }
}
