package designPattern.observer;

/**
 * Created by zhuanli.cheng on 2017/11/10.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
