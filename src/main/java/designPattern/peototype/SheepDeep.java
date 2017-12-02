package designPattern.peototype;

import java.util.Date;

/**
 * Created by zhuanli.cheng on 2017/11/21.
 */
public class SheepDeep implements Cloneable {
    private String name;
    private Date birthday;

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
        Object object = super.clone();
        SheepDeep sheep = (SheepDeep)object;
        sheep.birthday = (Date) this.birthday.clone();
        return super.clone();
    }
}
