package Sorting.quicksort;

public class q1 {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 8, 5, 10, 12, 11, 24, 18};
        int pivot = array.length-1;
        quicksort(array, pivot);
        
    }

    public static void quicksort(int[] arr , int pivot){
        





    }

    public static void swap(int[] arr,int  i,int j){

        int temp = arr[i];
        arr[i]  =arr[j];
        arr[j]  = temp;

    }
}
