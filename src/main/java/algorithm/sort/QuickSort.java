package algorithm.sort;

import java.util.Random;

public class QuickSort {

    /*
    可以头， 尾，中间三个数求中间值
     */
    public static int partition(int array[], int low, int high){
        if(null == array || low > high || low < 0 ){
            return -1;
        }
        int pivot = array[low];
        while (low < high){
            while (low < high && array[high] >= pivot){
                high --;
            }
            array[low] = array[high];
            while (low < high && array[low] <= pivot){
                low ++;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    public static int partition2(int[] array, int start, int end){
        if (null == array || start < 0 || end - start < 0){
            return -1;
        }
        int index = new Random().nextInt(end - start + 1) + start;
        swap(array, index, end);
        int small = start - 1;
        for (index = start; index < end; index ++){
            if (array[index] < array[end]){
                ++ small;
                if (small != index){
                    swap(array, index, small);
                }
            }
        }
        small ++ ;
        swap(array, small, end);
        return small;
    }

    public static void sort(int[] array, int low, int high){
        if (low >= high){
            return;
        }
        int partition = partition2(array, low, high);
        sort(array, low, partition -1);
        sort(array, partition + 1, high);
    }

    /**
     * 数组的swap，需要直接交换数组对于位置的值，不能直接进行值交换
     * @param array
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3, 2,4, 6, 1, 9 ,10, 5, 8};
        sort(array, 0, array.length - 1);
        for (int a : array){
            System.out.print(a + "\t");
        }
    }
}
