package Queue;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class QueLl{
    Node front=null;
    Node rear=null;
    void add(int val){
        Node node = new Node(val);
        if(rear==null){
            front=rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
    }
    int remove(){
        try {
            int data = front.val;
            front=front.next;
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    int peek(){
        try {
            return front.val;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    void print(){
        try {
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class MyQueue {
    public static void main(String[] args) {
        QueLl q = new QueLl();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.print();
        q.add(10);
        q.print();
        System.out.println(q.remove());
        q.print();
        System.out.println(q.peek());
    }
}
