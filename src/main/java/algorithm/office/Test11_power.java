package algorithm.office;

/**
 * Created by zhuanli.cheng on 2017/12/25.
 */
public class Test11_power {
    public static double power(double base, int exponent){
        if (exponent % 2 == 0){
            return power(base, exponent/2) * power(base, exponent/2);
        } else {
            return base * power(base, exponent/2) * power(base, exponent/2);
        }
    }
}
