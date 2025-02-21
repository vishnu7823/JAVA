public class evenodd {
    public static void main(String[] args) {
        
      System.out.println(condition(11));
    }

    public static boolean condition(int n){

        if(n<=0){
            System.out.println("0 is neither odd nor even");
        }

        if(n%2==0){
             return true;
        }else{
            return false;
        }


    }
}
