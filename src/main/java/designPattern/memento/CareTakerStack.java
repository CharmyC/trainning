package designPattern.memento;

import java.util.Stack;

/**
 * Created by zhuanli.cheng on 2017/11/24.
 */
public class CareTakerStack {
    private Stack<EmpMemento> stack = new Stack<EmpMemento>();
    public void mementoEmp(EmpMemento memento){
        stack.push(memento);
    }

    public EmpMemento getEmpForStack(){
        if (!stack.empty()){
            return stack.peek(); //只获取不删除
        } else {
            return null;
        }
    }

    public EmpMemento getEmpForStackAndRemove(){
        if (!stack.empty()) {
            return stack.pop();//pop获取后删除该元素
        }else{
            return null;
        }
    }

}
