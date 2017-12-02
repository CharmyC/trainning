package designPattern.Composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Composite extends Component {
    private List<Component> children = Lists.newArrayList();

    public Composite(String name){
        super(name);
    }
    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        if (children.size() > 0){
            children.remove(component);
        }
    }

    public void display(int depth) {
        StringBuffer sb = new StringBuffer("-");
        for (int i = 0; i <= depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
        for (Component com : children) {
            com.display(depth + 2);
        }
    }
}
