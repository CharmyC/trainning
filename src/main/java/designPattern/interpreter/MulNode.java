package designPattern.interpreter;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
