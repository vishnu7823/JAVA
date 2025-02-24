public class secondlast{

    public static void main(String[] args) {

        int[] array = {1,3,4,7,2,9,8};
        int[] array1 = {1,3,4,7,2,9,8};
        System.out.println(secondlarger(array));
         System.out.println(secondlargerestnum(array1));
        
        
    }

    public static int secondlarger(int[] arr){

        int largest =arr[0];
        int secondlargest =arr[1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
             secondlargest  =largest;
             largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest = arr[i];
            }
           
        }
        return secondlargest;

    }
 
    //using sorting
    public static int secondlargerestnum(int[] arr){
        int temp;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr.length-1){
                return arr[i];
            }
        }
        return -1;

    }
}