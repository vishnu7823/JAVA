public class problem {
    
    public static void main(String[] args){
        System.out.println(prime(7));
        System.out.println(prime(24));
        System.out.println(prime(99));
        System.out.println(prime(100));




    }

    public static boolean prime(int n){
        if(n<=1)
        return false;

        for(int i=2;i<Math.sqrt(n);i++){  //math.sqrt root is more optimized way
            if(n % i==0){
            return false;
            }
           
        }
        return true;
       
    }
}
