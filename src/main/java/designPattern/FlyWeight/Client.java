package designPattern.FlyWeight;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteFlyWeight chessBlack1 = FlyWeightFactory.getChess("black");
        ConcreteFlyWeight chessBlack2 = FlyWeightFactory.getChess("black");

        System.out.println(chessBlack1 == chessBlack2);

        chessBlack1.display(new Coordinate(1,2));
        chessBlack2.display(new Coordinate(3,4));
    }
}
