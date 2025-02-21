package Recursion;

public class fibonaci {

    public static void main(String[] args) {

        System.out.println(fibonaciseries(3));
        System.out.println(fibonaciseries(4));
        
    }

    public static int fibonaciseries(int n){

        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{

        return fibonaciseries(n-1)+fibonaciseries(n-2);
        }

    }
    
}
