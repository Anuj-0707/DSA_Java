package Queue;
class CircularQueue{
    int[] arr ;
    int front;
    int rear;
    int size;
    CircularQueue(int capacity){
        arr=new int[capacity];
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full");
            return;
        }
        arr[rear++]=val;
        if(rear==arr.length){
            rear=0;
        }
        size++;
    }
    int  remove(){
        if(size==0){
            System.out.println("Queue is empty");
            return  -1;
        }
        int data = arr[front];
        front++;
        if(front==arr.length){
            front=0;
        }
        size--;
        return data;
    }
    int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        if(front>=rear){
            for(int i=front;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class QueArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.add(10);q.add(20);q.add(30);q.add(40);
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}
