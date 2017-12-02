package designPattern.template;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public abstract class AbstractBankTemplate {
    public void takeNumber(){
        System.out.println("取号排队");
    }

    /**
     * 不确定的具体操作
     */
    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    /**
     * 模板方法，程序执行的整体流程一点，只有一小部分具体的操作不确定，
     * 延迟到子类中实现
     */
    public final void process(){
        takeNumber();
        transact(); // 需要子类具体实现
        evaluate();
    }
}
