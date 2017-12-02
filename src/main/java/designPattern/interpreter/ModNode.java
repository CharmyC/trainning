package designPattern.interpreter;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    public int interpret() {
        return left.interpret() % right.interpret();
    }
}
