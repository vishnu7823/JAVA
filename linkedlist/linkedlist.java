package linkedlist;

public class linkedlist {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addnode(0);
        list.addnode(1);
        list.display();
        
    }
//declare a node
    public class Node {
        int data;
        Node next;

        public Node(int data){  //constructor
            this.data = data;
            this.next = null;
        }
    }

    //declare head and tail
    public Node head = null;
    public Node tail = null;

    //add new nodes
  public void addnode(int data){
    Node newnode = new Node(data);
    if(head==null){
        head = newnode;
        tail = newnode;
    }else{
        tail.next = newnode;

        tail = newnode;

    }
  }

  //display all the linkedlist
  public void display(){
    Node current = head;
    if(head==null){
        System.out.println("list is empty");
    }else if(current!=null){
        System.out.println(current.data+" ");
        current = current.next;

    }
    System.out.println();

  }




}
