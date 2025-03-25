package linkedlist;

public class middlelinked {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  =data;
            this.next = null;

        }

       

        
        
    }

     //declare head and tail
        Node head = null;
        Node tail = null;

        //add new node

        public void addnode(int data){
            Node newnode = new Node(data);
            Node temp = head;

            if(head==null){
               head = newnode;
               tail=newnode;
            }else{
                tail.next = newnode;
                tail = newnode;
            }

        }

        public void display(){
            Node temp = head;
            if(temp==null){
                return;
            }else if(temp!=null){
                System.out.println(temp.data+"");
                temp = temp.next;
            }

        }


        public static void main(String[] args) {
            middlelinked newlist = new middlelinked();
            newlist.add(1);
            
        }
     
}
