package designPattern.interpreter;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
