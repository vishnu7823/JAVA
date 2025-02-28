import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] array = {9};
        System.out.println(Arrays.toString(addone(array)));
        
    }

    public static int[] addone(int[] arr){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]+1<10){
                arr[i]++;
                return arr;
            }
            else{

                arr[i] = 0;

            }
        }

        arr= new int[arr.length+1];
        arr[0] = 1;
        return arr;
    }
}
