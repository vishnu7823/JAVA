
//leetcode 540
import java.util.*;

public class singleelement {
    public static void main(String[] args) {
        int[] array = { 3, 3, 7, 7, 2, 4, 4 };
       int sol  =singlelementarray(array);
        System.err.println(sol);

    }

    public static int  singlelementarray(int[] arr){

        int start = 0;
        int end = arr.length-1;

        if(arr.length==1){
            return arr[start];
        }
        if(arr[start]!=arr[start+1]){
            return arr[start];
        }
        if(arr[end] != arr[end-1]){
            return arr[end];

        }

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==arr[mid+1]){
                if(mid%2==0){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
                
            }else if(arr[mid]==arr[mid-1]){
                if((mid-1)%2==0){
                    start = mid+1;
                }else{
                    end = mid-1;
                }

            }
            else{
                return arr[mid];
            }
        }
        return -1;

    }
}
