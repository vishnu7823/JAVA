public class fibonaci {

    public static void main(String args[]){
        System.out.println(fibonaciseries(10));

    }

    public static int fibonaciseries(int number){

        
        int secondlast=0;
        int last=1;
        int ans= 0;

        for(int i=2;i<=number;i++){

             ans= last+secondlast;
             secondlast = last;
            last = ans;
            
           
             System.out.println(ans);
            
           


            
        }
        return ans;
       



    }
    
}
