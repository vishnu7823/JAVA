//digittemp leetcode - 735=9

package stack;
import java.lang.reflect.Array;
import java.util.*;

public class q3 {

    public static void main(String[] args) {
        int[] array = {73,74,75,71,69,72,76,73};
        
        System.out.println(Arrays.toString(dailyTemperatures(array)));
        
    }

    public static  int[] dailyTemperatures(int[] arr){
        Stack<Integer> newstack = new Stack<>();
        int[] newarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!newstack.isEmpty() && arr[newstack.peek()]<arr[i]){
                newarr[newstack.peek()] = i=newstack.peek();
                newstack.pop();
            }
            newstack.push(i);
        }
        return newarr;

    }
    
}
