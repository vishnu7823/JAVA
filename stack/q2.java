

package stack;


import java.util.*;

public class q2 {
    public static void main(String[] args) {
        
    }
   
    public Class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this .next = null;
        }

    }
    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail= newnode;
        }

    }

    public void display(){
        if(head==null){
            System.out.println("stack is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        
    }

}
