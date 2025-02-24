import java.util.Arrays;

public class min {
    public static void main(String[] args) {
        int[] arrays = {3,1,8,43,56,23,12};
        System.out.println(minelement(arrays));
        System.out.println(minnumber(arrays));
        
    }

    public static int minelement(int[] arr){
        Arrays.sort(arr);
        int minnum = arr[0];
        return minnum;

    }

    public static int minnumber(int[] arr){

        int minnum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minnum){
                minnum = arr[i];
            }
        }
        return minnum;

    }

   
}
