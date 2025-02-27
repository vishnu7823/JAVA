public class subarray {
    public static void main(String[] args) {
        printsubarray(arr.length);
        
        
    }

    static int[] arr = new int[]{1,2,3,4,5};

    public static void printsubarray(int n){
               
      
        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + "");
                   
                }
                System.out.println();
              
            }
        }

    }
}
