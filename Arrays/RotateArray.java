package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number of steps of rotation : ");
        int d = sc.nextInt();
        sc.close();
        int[] arr = {1,2,3,7,8,9,4,5,6,1};
        System.out.println("Original Array\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.printf("After Rotation %d times\n",d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
