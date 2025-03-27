package queue;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("total size:"+q.getSize());
       
        System.out.println("first data:"+ q.peek());
        System.out.println("deleted element:"+q.dequeue());
        System.out.println("total size:"+q.getSize());
      


        
    }

    static class queue{
        ArrayList<Integer> list ;
        queue(){
            list = new ArrayList<>();

        }

        public void enqueue(int data){
            list.add(data);
            System.out.println("The elemts are:"+data);
           

        }

        public int dequeue(){
            if(list.size()==0){
                return -1;
            }else{
               int element = list.get(0);
               list.remove(0);
               return element;
            }

        }

        public int peek(){
            if(list.size()==0){
                return 0;
            }
            return list.get(0);

        }

        public int getSize(){
            return list.size();

        }
        
    }
}
