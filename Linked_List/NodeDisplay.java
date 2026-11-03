package LinkedList;
class Node{
    int val;
    Node next;
    Node(int x){
        this.val=x;
    }
}
public class NodeDisplay {
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40);
        Node e = new Node(50); 
        // connect karenge
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e; 
        display(a);       
    }
    public static void display(Node head){
        Node temp = head.next;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
