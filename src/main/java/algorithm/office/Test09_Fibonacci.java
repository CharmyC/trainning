package algorithm.office;

/**
 * Created by zhuanli.cheng on 2017/12/21.
 */
public class Test09_Fibonacci {

    public static long fibonacciRecursion(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }

    public static long fibonacci(int n){
        long[] result = {0, 1};
        if (n <= 1){
            return result[n];
        }

        for (int i = 2; i <= n; i ++ ){
            long tmp = result[1];
            result[1] = result[0] + result[1];
            result[0] = tmp;
        }
        return result[1];
    }

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        System.out.println(fibonacci(100));
        System.out.println(System.currentTimeMillis() - st);
        st = System.currentTimeMillis();
        System.out.println(fibonacciRecursion(100));
        System.out.println(System.currentTimeMillis() - st);
    }
}
