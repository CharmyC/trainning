package designPattern.visitor;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
