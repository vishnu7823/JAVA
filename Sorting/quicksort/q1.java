package Sorting.quicksort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

       
        
    }

    public static void   sort(int[] arr,int start,int end){
        if(start>=end){
            return ;
        }
      int mid = start+(end-start)/2;
      int pivot = arr[mid];

      while(start<=end){
        while(arr[start]<pivot){
            start++;
        }
        while(arr[end]>pivot){
            end--;
        }
        if(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
      }
      //now pivot is at correct position then sort the two halves of the array

      sort(arr,start,end);
      sort(arr,start,end);



    }

    
}
