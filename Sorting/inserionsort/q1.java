package Sorting.inserionsort;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 8, 5, 10, 12, 11, 24, 18};
        
        inserttionsort(array);
        System.out.println(Arrays.toString(array));
        
    }




    public static void inserttionsort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = arr[j];
            if(temp<arr[i]){
                swap(arr, i, j);
            }

            }
            

        }


       

    }

    

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
