
package stack;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
       Stack mystack = new Stack();
       mystack.add(10);
       mystack.add(20);
       mystack.add(30);

       System.out.println("top elements:"+" "+ mystack.peek());
       System.out.println("Popped element:"+" "+mystack.pop());
       System.out.println("Stack size:"+" "+mystack.getSize());

        
    }

    static class Stack{
        ArrayList<Integer> list;
        Stack(){
            list =new ArrayList<>();
        }

        public void add(int element){
           list.add( element);
        }

        public  int peek(){
            if(list.size() == 0){
                return -1;
            }else{
                return  list.get(list.size()-1);
            }
        }

        public int pop(){
            if(list.size()==0){
               return -1; 
            } 
            int element = this.peek();
            list.remove(list.size()-1);
            return element;

        }

        public int getSize(){
            return list.size();
        }
    }
}
