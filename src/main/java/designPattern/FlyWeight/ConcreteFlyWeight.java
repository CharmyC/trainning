package designPattern.FlyWeight;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class ConcreteFlyWeight implements FlyWeight {
    private String color;
    public ConcreteFlyWeight(String color){
        super();
        this.color = color;
    }
    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + this.color);
        System.out.println("棋子位置：(" + c.getX() + "," + c.getY()+ ")");
    }
}
