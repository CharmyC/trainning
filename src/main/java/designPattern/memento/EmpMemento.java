package designPattern.memento;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento(EmpOriginator empOriginator) { //从发起人那备份数据
        this.ename = empOriginator.getEname();
        this.age = empOriginator.getAge();
        this.salary = empOriginator.getSalary();
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
