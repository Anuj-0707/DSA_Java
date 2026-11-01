package LinkedList;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int x){
        this.val=x;
    }
}
public class LinkList {
    static Node start = null;
    static Node tail = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.print("Enter the value : ");
            insert(sc.nextInt());
            System.out.println("Do you want to enter again Y/y/N/n");
            choice = sc.next().charAt(0);
        }
        while(choice=='y'||choice=='Y');
        System.out.println("Here is your all nodes");
        display();
        sc.close();
    }
    public static void insert(int x){
        Node head = new Node(x);
        if(start==null){
            start = tail = head;
            System.out.println("Node has inserted with value "+x);
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to insert at head or tail h/t");
            char ch = sc.next().charAt(0);
            if(ch=='t'){
                tail.next=head;
                tail=head;
                System.out.println("Node has inserted at tail with value "+x);
            }
            else{
                head.next=start;
                start=head;
                System.out.println("Node has inserted at head with value "+x);
            }
            sc.close();
        }
    }
    public static void display(){
        if(start==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=start;
        while(temp.next!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.val);
    }
}
