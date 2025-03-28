//implement queue using stack;

package queue;
import java.util.*;

import Sorting.All.sorting;
public class q3 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("peek element:"+q.peek());
        System.out.println("pop element:"+q.pop());
        System.out.println("pop element:"+q.getsize());

        
    }

    static class Queue{

        public Stack<Integer> s1;
        public Stack<Integer> s2;

        Queue(){
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int data){
            s1.push(data);
            System.out.println(data);

        }

        public int pop(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();

        }

        public int peek(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public int getsize(){
            return s2.size();
        }



    }
}
