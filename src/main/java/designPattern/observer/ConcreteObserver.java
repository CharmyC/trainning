package designPattern.observer;

/**
 * Created by zhuanli.cheng on 2017/11/10.
 */
public class ConcreteObserver implements Observer {
    private Subject subject;
    private float temp;

    protected ConcreteObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void update(float temp) {
        this.temp = temp;
    }
}
