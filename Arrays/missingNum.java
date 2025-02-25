import java.util.HashSet;

public class missingNum {
    public static void main(String[] args) {
        int[] array = {3,0,1};
        System.out.println(missingnumber(array));
        System.out.println(missingnumset(array));
        
    }

    //using expected sum formula;
    public static int missingnumber(int[] arr){
        int n= arr.length;
        int ExpectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0;i<n;i++){
            actualSum +=arr[i];
        }

        return ExpectedSum-actualSum;
    }

    //using hashset
    public static int missingnumset(int[] arr){
            HashSet<Integer> set = new HashSet<>();
            for(int num:arr){
                set.add(num);
            }

            for(int i=0;i<arr.length;i++){
                if(!set.contains(i)){
                    return i;
                }
            }
            return -1;

    }
}
