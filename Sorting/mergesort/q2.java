package Sorting.mergesort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] array ={2, 1, 4, 3, 8, 5, 10, 12, 11, 24, 18};
        mergesort(array, 0, 10);
        System.out.println(Arrays.toString(array));
        
    }


    public static void  mergesort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid = low+(high-low)/2;

        mergesort(arr, low, high);
        mergesort(arr, mid+1, high);

        merge(arr,low,mid,mid+1,high);


    }

    public static void merge(int[] arr, int low1,int high1,int low2,int high2 ){
        int[] newarr = new int[high2-low1 + 1];
        int index1  = low1;
        int index2 = low2;
        int index = 0;

        while(index<newarr.length){
            if(index1>high1){
                newarr[index] = arr[index2];
                index2++;
                index++;
            }

            if(index2>high2){
                newarr[index] = arr[index1];
                index1++;
                index++;
            }

            if(arr[index1]>arr[index2]){
                newarr[index]  =arr[index2];
                index2++;
                index++;


            }
            else{
                newarr[index] = arr[index1];
                index1++;
                index++;
            }
        }
        for(int i=0;i<newarr.length;i++){
            arr[low1++] = newarr[i];
        }

    }
}
