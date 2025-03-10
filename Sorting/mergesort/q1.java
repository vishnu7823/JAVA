package Sorting.mergesort;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
       System.out.println(mergesort(array1, array2));
        
        
    }

    public static int[] mergesort(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m  =arr2.length;
        
        int[] newArray = new int[n+m];
        
        int index1 = 0;
        int index2 = 0;
        int resultindex = 0;

        while(resultindex<n+m){

            if(index1==n){
                newArray[resultindex] = arr2[index2];
                index2++;
                resultindex++;

            }

            if(index2 == m){
                newArray[resultindex] = arr1[index1];
                index1++;
                resultindex++;
            }

            


        }
        return newArray;
}
}
