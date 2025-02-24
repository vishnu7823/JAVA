public class meanavg {
    public static void main(String[] args) {
        int [] array = {3,1,8,43,56,23,12};
        System.out.println(meanmethod(array));
        
    }

    public static int meanmethod(int[] arr){
        int sum = 0;
        int mean = arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        return sum/mean;



    }
}
