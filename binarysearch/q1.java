package binarysearch;

public class q1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,8,9,10,12,34};
        System.out.println(binarysearch(array, 10));
        System.out.println(binarysearch(array, 2));
        System.out.println(binarysearch(array, 5));
        System.out.println(binarysearch(array, 8));
        System.out.println(binarysearch(array, 12));
        System.out.println(binarysearch(array, 34));
        System.out.println(binarysearch(array, 6));
        
    }

    public static int binarysearch(int[] arr, int target){

        
        int start = 0;
        int end = arr.length-1;
       while(start<=end){
        int mid = start+(end-start)/2;

        if(target<arr[mid]){
            end = mid-1;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }
        else{
            return mid;
        }
       }
       return -1;

    }
}
