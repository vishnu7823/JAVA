public class sum{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(sumArray(array));
        
    }

    public static int sumArray(int[] arr){

        int currentvalue =0;
        for(int i=0;i<arr.length;i++){
            
                currentvalue +=arr[i];
        }
        return currentvalue;




    }
}