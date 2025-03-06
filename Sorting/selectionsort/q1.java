package Sorting.selectionsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array = { 5,4,3,2,1};
        selectionsort(array);
        System.out.println(Arrays.toString((array)));
        
    }

    public static void selectionsort(int[] arr){
        
       int min =arr[0];
       for(int i=0;i<arr.length-1;i++){

        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
            swap(arr, i, j);

        }
       }
    }

    public static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
