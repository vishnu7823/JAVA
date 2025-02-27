import java.util.Arrays;

public class greateselement {
    
    public static void main(String[] args) {
        int[] array = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(greaterelement(array)));
        
    }

    public static int[] greaterelement(int[] arr){
       int max =-1;
       for(int i=arr.length-1;i>=0;i--){
        int current_max = arr[i];
        arr[i] = max;
        max = Math.max(max,current_max);
       }
       return arr;
    }
}
