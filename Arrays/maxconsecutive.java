
//485. Max Consecutive Ones

public class maxconsecutive {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxconsecutive(arr));
        
    }

    public static int maxconsecutive(int[] nums){
        int max_streak = 0;
        int current_streak = 0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==1){
                current_streak++;
            }
            else{
                max_streak = Math.max(max_streak,current_streak);
                current_streak = 0;
            }
        }
        return Math.max(max_streak,current_streak);
    }
    
}
