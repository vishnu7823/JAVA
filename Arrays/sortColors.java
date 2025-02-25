//75. Sort Colors

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {

        int[] array = {2,0,2,1,1,0};
        sortcolor(array);
        System.out.println(Arrays.toString(array));
        
    }

     static void sortcolor(int[] arr){

        int temp;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
