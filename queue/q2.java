//queue using linkedlist

package queue;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;


        }
}
   static class Queue{
    Node front;
    Node rear;
    int length;

    public Queue(){
        this.front= null;
        this.rear = null;
        this.length = 0;
    }

    public static  void enqueue(int data){
        this.length++;
    Node temp =  new Node(data);

    }

    public int dequeue(){

    }

    public int peek(){

    }

    public int getsize(){

    }

   }

   
}
