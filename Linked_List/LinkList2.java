package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    void addAtTail(int value){
        Node temp = new Node(value);
        if(tail==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    void display(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void addAtHead(int value){
        Node temp = new Node(value);
        temp.next=head;
        head=temp;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
    }
    boolean search(int value){
        if(head==null){
            return false;
        }
        else{
             Node temp = head;
            while(temp!=null){
                if(temp.val==value){
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }
    void insertAtidx(int index, int value){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node prev = head;
            Node temp = head;
            int count = 0;
            while(temp!=null&&count!=index){
                prev=temp;
                temp=temp.next;
                count++;
            }
            if(temp!=null){
                Node node = new Node(value);
                prev.next=node;
                node.next=temp;
            }
        }
    }
    void reverse(){
        Node d = null;
        Node prev=head;
        for(Node curr=head;curr!=null;curr=curr.next){
            curr=curr.next;
            prev.next=d;
            d=prev;
            prev=curr;
        }
        display();
    }
}
public class LinkList2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addAtTail(10);
        l.addAtTail(20);
        l.addAtTail(30);
        l.addAtTail(40);
        l.addAtHead(30);
        l.addAtHead(50);
        l.addAtHead(60);
        l.display();
        l.reverse();
    }
}
