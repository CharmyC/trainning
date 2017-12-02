package designPattern.strategy;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class Client {
    public static void main(String[] args) {
        double price = 998;//商品价格
        Strategy generalUser = new GeneralUser();//普通用户
        Strategy registerUser = new RegisterUser();//注册用户
        Strategy oldVip = new VipUser();//老会员

        //根据不同的用户打不同的折扣
        Context c1 = new Context(generalUser);
        c1.printPrice(price);
        Context c2 = new Context(registerUser);
        c2.printPrice(price);
        Context c4 = new Context(oldVip);
        c4.printPrice(price);
    }
}
