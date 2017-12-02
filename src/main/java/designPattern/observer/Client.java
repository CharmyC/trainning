package designPattern.observer;

/**
 * Created by zhuanli.cheng on 2017/11/10.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        subject.setTemperature((float) 21.00);
        System.out.println("observer1 temperature:" + observer1.getTemp());
        System.out.println("observer2 temperature:" + observer2.getTemp());
        subject.removeObserver(observer2);
        subject.setTemperature((float) 620.00);
        System.out.println("observer1 temperature:" + observer1.getTemp());
        System.out.println("observer2 temperature:" + observer2.getTemp());

    }
}
