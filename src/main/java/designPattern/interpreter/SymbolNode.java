package designPattern.interpreter;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
