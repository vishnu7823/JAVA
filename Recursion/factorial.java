package Recursion;

public class factorial {
    
    public static void main(String[] args){
        System.out.println(recursivefactorial(5));

    }

    public static int recursivefactorial(int n){

        if(n==0){
        return 1;
        }
        return n*recursivefactorial(n-1);

        

    }
}
