//26. Remove Duplicates from Sorted Array

public class Removeduplicates {
    public static void main(String[] args) {
        int[] arrays = {0,1,1,2,3,4,4,5};
        System.out.println(removedup(arrays));
        
    }

    public static int removedup(int[] arr){
        int newIndex = 1;
        for(int i=1;i<arr.length;i++){

            if(arr[i-1]!=arr[i]){
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
