package Arrays;
public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9,4,6,1,12,2,3};
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
