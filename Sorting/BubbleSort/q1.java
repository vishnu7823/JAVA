//bubble sort


package Sorting.BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array = {2,1,4,3,8,5,10,12,11,24,18};
      bubblesort(array);
        System.out.println((Arrays.toString(array)));
    }

    public static void bubblesort(int[] arr){
        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                swap(arr, i, j);
                }
            }
         
        }




    }

    public static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
