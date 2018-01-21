package algorithm.office;

public class Test08_Min {
    /**
     * 直接返回数组的索引
     * @param array
     * @param length
     * @return
     */
    public static int min(int[] array){
        if (null == array || array.length == 0 ){
            return -1;
        }
        int low = 0;
        int high = array.length -1;
        int mid = low;
        while (array[low] >= array[high]){
            if (high - low == 1){
                mid = high;
                break;
            }
            mid = low + (high - low)/2;
            if (array[low] == array[mid] && array[low] == array[high]){
                return inOrderMin(array, low, high);
            }
            if (array[low] <= array[mid]){
                low = mid;
            } else if (array[mid] <= array[high]){
                high = mid;
            }
        }
        return mid;
    }

    public static int inOrderMin(int[] array, int low, int high){
        if (null == array || low < 0 || high -low <= 0){
            return -1;
        }
        int resultIndex = low;
        int resultValue = array[low];
        for (int index = low + 1; index <= high; index ++){
            if (resultValue > array[index]){
                resultValue = array[index];
                resultIndex = index;
            }
        }
        return resultIndex;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1};
        System.out.println(min(array));
    }
}
