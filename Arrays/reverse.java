
import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reversearray(array);
       System.out.print( Arrays.toString(array));
         
    }

    public static void reversearray(int[] arr){


        
            for(int i=0;i<arr.length/2;i++){  //loop to half of the array and change the first half eleemnts to last half by swapping
                 
                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;


            }
            
        



    }
}
