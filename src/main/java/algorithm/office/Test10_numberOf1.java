package algorithm.office;

/**
 * Created by zhuanli.cheng on 2017/12/25.
 * 1. 判断一个数是不是二的次方 （n-1) & n == 0
 * 2. 两个数二进制需要改变多少位能替换成一样， （m ^ n）在统计其1的个数
 * 3. (n - 1) & n 相当于把最右边的1变为0
 */
public class Test10_numberOf1 {
    /**
     * 当31位为1时，最高为的1统计不了
     *
     * @param number
     * @return
     */
    public static int oneCount(int number){
        int count = 0;
        int flag = 0x00000001;
        while (flag > 0){
            System.out.println("flag:" + Integer.toHexString(flag));
            System.out.println("number & flag:" + (number & flag));
            if ( (number & flag) == flag){
                count ++;
            }
            flag <<= 1; //除法效率比移位效率低
        }
        return count;
    }

    public static int numberOf1(int number){
        int count = 0;
        while (number != 0){
            count ++;
            number = (number - 1) & number; //number减1降位，和number相与，将整数最右边的1变为0，只需要循环count次
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println();
        System.out.println(oneCount(070000000));
        System.out.println(numberOf1(070000000));
    }
}
