package Sorting.mergesort;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] array ={2, 1, 4, 3, 8, 5, 10, 12, 11, 24, 18};
        mergesort(array, 0, 10);
        System.out.println(Arrays.toString(array));
        
    }

    public static void mergesort(int[] arr,int low,int high){

        if(low>=high){
            return;
        }

        int mid = low+(high-low)/2;

        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);

        merge(arr, low,mid,mid+1,high);

    

    }

    public static void merge(int[] arr,int low1,int high1,int low2,int high2){

        int[] newArray = new int[high2-low1+1];

        int index1 = low1;
        int index2 = low2;
        int index =0;


        while(index<newArray.length){

            if(index1>=high1){
                newArray[index] = arr[index2];
                index2++;
                index++;
                continue;
            }
         if(index2>=high2){
                newArray[index] = arr[index1];
                index1++;
                index++;
                continue;
            }
            
            if(arr[index1]>arr[index2]){
                arr[index] = arr[index2];
                index2++;
                index++;
            }else{
                arr[index] = arr[index1];
                index1++;
                index++;
            }
        }

    }
}
