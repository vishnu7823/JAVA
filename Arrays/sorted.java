public class sorted {
    public static void main(String[] args) {
        int[] array = {1,3,5,2,4,3};
        int[] array1= {1,2,3,4,5};
        System.out.println(check(array));
        System.out.println(check(array1));

        
    }
public static void sortedArray(int[] arr){

    
    
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

}

public static boolean check(int[] arr){
    
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            return false;
        }
        
    }
    return true;
    

    

}

}
