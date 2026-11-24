package Binary_Search;

import java.util.Scanner;

public class KthmissingNumber {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the k of missing +ve number : ");
        int k = sc.nextInt();
        int [] arr = {3,5,6,7,8,11};
        int start = 0;
        int end = 5;
        while(start <= end){
            int mid = (start+end)/2;
            int missing = arr[mid]-mid-1;
            if(missing>=k){
                end=mid-1;
            }
            else if(missing<k){
                start=mid+1;
            }
        }
        System.out.printf("Missing  %dth number is %d",k,(k+start));
        sc.close();
    }
}
