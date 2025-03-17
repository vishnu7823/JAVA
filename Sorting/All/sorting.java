package Sorting.All;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        System.out.println("All sorting techniques under brutforce approach");
        int[] arr = {2, 1, 4, 3, 8, 5, 10, 12, 11, 24, 18};
        //mergesort
        arr = mergesort(arr);
        System.out.print("mergesort:");
        System.out.println(Arrays.toString(arr));
        //bubblesort
        arr= bubblesort(arr);
        System.out.print("bubblesort:");
        System.out.println(Arrays.toString(arr));
        //selection sort
        arr= selectionsort(arr);
        System.out.print("selectionsort:");
        System.out.println(Arrays.toString(arr));
        //insertionsort
         arr= insertionsort(arr);
        System.out.print("insertionsort:");
        System.out.println(Arrays.toString(arr));
        
    
    }
    //mergesort
    public static int[] mergesort(int[] arr){
        
        if(arr.length ==1){
            return arr;
        }
        
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        
        for(int i=0;i<mid;i++){
            left[i] = arr[i];
        }
        
        for(int j = mid;j<arr.length;j++){
            right[j-mid] = arr[j];
        }
        
        left = mergesort(left);
        right = mergesort(right);
        
        return merge(left,right);
    }
    
    public static int[] merge(int[] first,int[]second){
        int[] newarr = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                newarr[k] = first[i];
                i++;
            }
            else{
                newarr[k] = second[j];
                j++;
            }
            k++;
        }
        
        //another condition if array hs some remaining elements
        while(i<first.length){
            newarr[k]  =first[i];
            i++;
            k++;
        }
        while(j<second.length){
            newarr[k] = second[j];
            j++;
            k++;
        }
        
        return newarr;
    }
    
    
    //bubblr sort
    
    public static int[] bubblesort(int[] arr){
        
        for( int i=0;i<arr.length-1;i++){
            for( int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
        
        
    }
    //selection sort
    
    public static int[] selectionsort(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                swap(arr,i,min);
            }
        }
        return arr;
    }
    
    //insertion sort
    
    public static int[] insertionsort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                   temp= arr[j];
                if(temp<arr[i]){
                 
                    swap(arr,i,temp);
                }
            }
            
        }
        return arr;
    }
    
    //common swap methoid for all uses
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
    
}
