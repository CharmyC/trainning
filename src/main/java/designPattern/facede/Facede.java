package designPattern.facede;

/**
 * Created by zhuanli.cheng on 2017/11/13.
 */
public class Facede {
    private ChildSystemOne childSystemOne;
    private ChildSystemTwo childSystemTwo;

    public Facede(){
        this.childSystemOne = new ChildSystemOne();
        this.childSystemTwo = new ChildSystemTwo();
    }
    public void print(){
        this.childSystemOne.print();
        this.childSystemTwo.print();
    }
}
