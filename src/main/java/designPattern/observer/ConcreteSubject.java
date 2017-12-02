package designPattern.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhuanli.cheng on 2017/11/10.
 */
public class ConcreteSubject implements Subject {
    private final List<Observer> observers;
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.temperatureChange();
    }

    public void temperatureChange() {
        this.notifyObserver();
    }



    public ConcreteSubject() {
        this.observers = Lists.newArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) >= 0){
            observers.remove(observer);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(this.temperature);
        }
    }
}
