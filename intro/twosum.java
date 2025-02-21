public class twosum {
    public static void main(String[] args) {
        int targetnum  =1;
        int targetsum = 110;
        int[] array = {2,3,5,7,1,11};
        System.out.println(findtarget(array, targetnum));
        System.out.println(findtwosum(array, targetsum));
        
    }
    public static int findtarget(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                target = arr[i];

                return target;
            }
        }
        return -1;
    }

    public static boolean findtwosum(int[] arr, int targetsum){
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == targetsum){
                   
                    return true;
                    
                }
            }
            
        }
        return false;
    }
}
