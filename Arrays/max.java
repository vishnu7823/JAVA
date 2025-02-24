import java.util.Arrays;

public class max {
    public static void main(String[] args) {

        int[] array = {3,1,8,43,56,23,12};
        System.out.println(maxelement(array));
        System.out.println(maxnum(array));

        
    }

    public static int maxelement(int[] arr){

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;

    }

    public static int maxnum(int[] arr){
        int maxnumber = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxnumber){
                maxnumber = arr[i];
            }
            
        }
        return maxnumber;

    }
}
