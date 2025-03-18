 //kids with greatest number of candies

 import java.util.*;
 public class q1{
    public static void main(String[] args) {
       q1 sol = new q1();
        int[] array = {2,3,5,1,3};
        System.out.println(sol.kidswithCandies(array, 3));
        System.out.println(array);
        
    }

    
    public static List<Boolean> kidswithCandies(int[] candies,int extracandies){

        List<Boolean> result = new ArrayList<>();
        int maxcandies = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxcandies){
                maxcandies = candies[i];
            }
        }

        for(int j=0;j<candies.length;j++){
            if(candies[j]+extracandies >=maxcandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;

    
}
    
}
