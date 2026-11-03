package LinkedList;

import java.util.Scanner;

class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val=val;
        this.next=null;
    }
}
class DoublyLinkedlist{
    DNode head;
    DNode tail;
    int size(DNode head ){
        DNode temp=head;
        int l = 0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        return l;
    }
    void addAtHead(int value){
        DNode temp = new DNode(value);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        display();
    }
    void addAtTail(int value){
        DNode temp = new DNode(value);
        if(tail==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        display();
    }
    void insert(int index,int value){
        int l_idx = size(head);
        if(index==0){
            addAtHead(value);
        }
        else if(index==l_idx){
            addAtTail(value);
        }
        else if(index<0 || index>l_idx){
            System.out.println("Invalid Index");
        }
        else{
            DNode node = new DNode(value);
            DNode temp=head;
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            node.prev=temp.prev;
            temp.prev.next=node;
            temp.prev=node;
            node.next=temp;
        }
        display();
    }
    void delete(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Delete from head\n2 : Delete from tail\n3 : Delete the value");
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();

        switch(ch){
            case 1 : delHead();
            break;
            case 2 : delTail();
            break;
            case 3 : delbyval();
            break;
            default : System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
    void delHead(){
        int len = size(head);
        if(len==1){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
        display();
    }
    void delTail(){
        int len = size(head);
        if(len==1){
            head=tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        display();
    }
    void delbyval(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to delete : ");
        int val = sc.nextInt();
        DNode temp = head;
        boolean flag = false;
        while(temp!=null){
            if(temp.val==val){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                flag=true;
            }
            temp=temp.next;
        }
        if(!flag){
            System.out.println("Entered value is not found in the list");
        }
        display();
        sc.close();
    }
     void display(){
        DNode temp=head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(temp.next!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println(temp.val);
     }
}
public class LinkedlistDoubly {
    public static void main(String[] args) {
        DoublyLinkedlist ll = new DoublyLinkedlist();
        ll.addAtHead(26);
        ll.addAtTail(25);
        ll.addAtTail(28);
        ll.addAtTail(20);
        ll.addAtTail(45);
        ll.addAtTail(12);
        ll.addAtTail(36);
        ll.addAtHead(27);
        ll.display();
        ll.insert(4, 89);


    }
}
