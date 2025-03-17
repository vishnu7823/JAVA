package Sorting.mergesort;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    

    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

       for(int i=0;i<mid;i++){  //use to copy the left subarray
        left[i] = arr[i];
       }

       for(int j=mid;j<arr.length;j++){ //use to cpy the right sub array
        right[j-mid] = arr[j];
       }

       left = mergesort(left);
       right = mergesort(right);
        

        return merge(left,right);



       

    }
    public static int[] merge(int[] first,int[] second){
        int[] newarr = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                newarr[k] = first[i];
                i++;
            }else{
                newarr[k] = second[j];
                j++;
            }
            k++;
        }

        //what if there are some elements still remaining
        //these two loops will work like either or condition
        while(i<first.length){
            newarr[k] = first[i];
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
}
