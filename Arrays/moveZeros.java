//283. Move Zeroes
import java.util.*;
public class moveZeros {

    public static void main(String[] args){

        int[] array = {1,0,1,1,0,0,1};
        moveZerosend(array);
      

    }


    public static void moveZerosend(int[] nums){
     int temp;
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length-1;j++){
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;

            }
        }

    }
    
}
