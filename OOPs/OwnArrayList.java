package OOPs;
class ArrayList{
    int[] arr=new int[1];
    int idx = 0;
    int size=0;
    void add(int ele){
        if(idx==arr.length){
            int[] arr2 = new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
        arr[idx++]=ele;
        size++;
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(i==size-1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
    void get(int i){
        System.out.println(arr[i]);
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(10); arr.add(20); arr.add(30);arr.add(30);arr.add(30);arr.add(30);arr.add(30);
        arr.display();
        arr.get(2);
    }
}
