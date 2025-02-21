public class problem2{

    public static void main(String[] args) {

        int[] array = {5,8,1,9,3,2,7};
        System.out.println(sorting(array));
        
    }

    public static int sorting(int[] arr){

        
        int leastnum = arr[0];
        
        for(int i=0;i<arr.length;i++){
          if(arr[i]>leastnum){
            leastnum = arr[i];
            i++;

          }
        } 
        return leastnum;


    }
}