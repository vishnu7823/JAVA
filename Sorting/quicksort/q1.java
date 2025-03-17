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
      
      //partition:
      int pivot = partition(arr, start, end);

      sort(arr,start,pivot-1);
      sort(arr,pivot+1,end);



    }

    public static int partition(int[]arr, int start, int end){

        int left = start;
        int right  =end;
        int mid = start+(end-start)/2;
      int pivot = arr[mid];

      while(left<=right){
        while(arr[left]<pivot){
            left++;
        }
        while(arr[right]>pivot){
            right--;
        }
        if(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
      }
      return left; //partion index
    }

    
}
