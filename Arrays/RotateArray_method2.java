package Arrays;

public class RotateArray_method2 {
    public static void main(String[] args) {
        int[] arr = {1,8,3,4,5,6,7,2,9};
        reverse(arr, 0, 3);
        reverse(arr, 4, 8);
        reverse(arr, 0, 8);

    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+", ");
        }
        System.out.println("\n");
    }
}
