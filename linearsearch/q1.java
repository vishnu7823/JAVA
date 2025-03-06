public class q1 {
    public static void main(String[] args) {
        int[] array = {2,1,4,3,6,7,4,8};
        System.out.println(linearsearch(array, 0));
        System.out.println(linearsearch(array, 8));
        
    }

    public static boolean linearsearch(int[] arr ,int  target){
        for(int i=0;i<arr.length;i++){

            if(target == arr[i]){
                return true;
            }
        }
       return  false;
    }
}
