package designPattern.builder;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class Client {
    public static void main(String[] args) {
        Person man = new PersonDirector().constructPerson(new ManBuilder(new Person(), "man"));
        System.out.println(man.getHead());
        System.out.println(man.getBody());
        System.out.println(man.getFoot());
    }
}
