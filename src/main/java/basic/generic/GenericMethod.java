package basic.generic;

/**
 * Created by zhuanli.cheng on 2017/12/13.
 */
public class GenericMethod {
    public static <T> T getType(T x){
        System.out.println(x.getClass().getName());
        return (T) x.getClass();
    }

    public static void println(Integer t){
         getType(t);
    }
    public static void main(String[] args) {
        Integer i = new Integer(0);
        GenericMethod.println(i);
    }
}
