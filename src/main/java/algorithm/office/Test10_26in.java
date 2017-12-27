package algorithm.office;

/**
 * Created by zhuanli.cheng on 2017/12/25.
 */
public class Test10_26in {
    public static long excelCharToNumber(String index){
        long result = -1L;
        if (null == index || index.length() == 0){
            return result;
        }
        result = 0;
        for (int i = 0; i < index.length(); i ++){
            result = result * 26 + (index.charAt(i) - 64);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(excelCharToNumber("AZ"));
    }
}
