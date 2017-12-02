package designPattern.memento;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class EmpOriginator {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento emento(){
        return new EmpMemento(this); // 将当前自身对象备份
    }
    public void recovery(EmpMemento empMemento){
        this.ename = empMemento.getEname();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
