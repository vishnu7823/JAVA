public class reverseint {
    public static void main(String[] args) {
        int number  = 156;
        System.out.println(reverseintmethod(number));
        
    }

    public static int reverseintmethod(int n){

        long rev =0;
        while(n!=0){
        int lastdigit = n%10;
        n = n/10;

        rev =rev*10+lastdigit;

        // if(rev >Integer.MIN_VALUE || rev < Integer.MAX_VALUE){
        //     return 0;
        // }

        }
        return (int) rev;


    }
}
