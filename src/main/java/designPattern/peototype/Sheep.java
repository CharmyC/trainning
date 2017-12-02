package designPattern.peototype;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;

    public Sheep(){

    }
    public Sheep(String name, Date date){
        this.name = name;
        this.birthday = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
