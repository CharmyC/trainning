package designPattern.template;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class Client {
    public static void main(String[] args) {
        // 使用匿名类实现模板方法的具体操作
        AbstractBankTemplate template = new AbstractBankTemplate() {
            @Override
            public void transact() {
                System.out.println("取钱");
            }
        };
    }
}
