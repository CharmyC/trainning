package designPattern.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Created by zhuanli.cheng on 2017/11/23.
 */
public class ConcreteMyAggregate implements Iterable {
    private List<Object> list = Lists.newArrayList();

    public void addObject(Object obj){
        this.list.add(obj);
    }
    public void removeObject(Object obj){
        this.list.remove(obj);
    }
    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }

    public Iterator iterator() {
        return new AggregateIterator();
    }

    private class AggregateIterator implements Iterator{
        private int cursor;

        public boolean hasNext() {
            if (cursor < list.size()){
                return true;
            }
            return false;
        }

        public Object next() {
            if (cursor < list.size()) {
                return list.get(cursor++);
            }
            return null;
        }

        public void remove() {

        }
    }

    public static void main(String[] args) {
        ConcreteMyAggregate c = new ConcreteMyAggregate();
        c.addObject(2);
        c.addObject(3);
        c.addObject(4);
        for(Object o : c){
            System.out.println(o);
        }
    }
}
