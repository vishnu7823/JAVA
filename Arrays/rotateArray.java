public class rotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
    }

    public static int rotate(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
           
            swap(arr,i,i+1);
        }



    }

    public void swap(int[] arr, int i,int j){
      
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        
    }
    


}
