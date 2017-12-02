package designPattern.visitor;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
