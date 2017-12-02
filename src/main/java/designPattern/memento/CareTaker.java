package designPattern.memento;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
