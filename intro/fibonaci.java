public class fibonaci {

    public static void main(String args[]){
        System.out.println(fibonaciseries(10));

    }

    public static int fibonaciseries(int number){

        int last=0;
        int secondlast=1;
        int ans= 0;

        for(int i=2;i<=number;i++){

             ans= last+secondlast;
            
             secondlast = ans;
             last = secondlast;
             System.out.println(ans);
            
           


            
        }
        return ans;
       



    }
    
}
