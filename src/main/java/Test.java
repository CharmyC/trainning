/**
 * Created by zhuanli.cheng on 2017/12/13.
 */
public class Test {
    public static Integer secondMax(int[] array){
        if (null == array || array.length < 2){
            return null;
        }
        if (array.length == 2){
            return array[0] < array[1] ? array[0] : array[1];
        }
        int firstMax = array[0];
        int secondMax = array[0];
        for (int i = 1; i < array.length; i ++){
            if (array[i] > firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] <= firstMax && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        //int[] array = new int[]{-1, 9, 13, 2, 20, -9, 10, 20, 1};
//        int[] array = new int[]{ 20,  20,  20,  20, 20,  20,  20, 20,  20};
        int[] array = new int[]{ 20,  10};
        Integer result = secondMax(array);
        if (null == result){
            System.out.println("error");
        } else {
            System.out.println(result);
        }
    }
}
