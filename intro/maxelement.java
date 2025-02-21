import java.util.Arrays;

public class maxelement {
    public static void main(String[] args) {
        int[] array = {5,3,8,6,1,0,8};
        System.out.println(findmax(array));
        
    }

    public static int findmax(int[] arr){

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;


    }
}
