package designPattern.Composite;

/**
 * Created by zhuanli.cheng on 2017/11/22.
 */
public class Leaf extends Component {

    public Leaf(String name){
        super(name);
    }
    public void add(Component component) {

    }

    public void remove(Component component) {

    }

    public void display(int depth) {
        StringBuffer sb = new StringBuffer("-");
        for (int i = 0; i <= depth; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString()+name);
    }
}
