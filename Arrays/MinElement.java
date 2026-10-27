package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9,4,6,1,12,2,3};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
