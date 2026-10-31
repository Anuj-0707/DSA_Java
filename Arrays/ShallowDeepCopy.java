package Arrays;
import java.util.Arrays;
public class ShallowDeepCopy {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,6};
        // Shallow copy
        int[] x = arr;
        x[2] = 8;
        System.out.println(arr[2]);
        //Deep copy
        int[] y = Arrays.copyOf(arr, 5);
        y[2]=8;
        System.out.println(arr[2]);
    }
}