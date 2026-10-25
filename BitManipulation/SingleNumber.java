/*Problem Statement:

You are given an integer array arr in which every element appears exactly twice except for one element, which appears exactly once. Find and return the element that appears only once.

You must solve the problem in \(O(n)\) time complexity and \(O(1)\) extra space.*/ 
package BitManipulation;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(findUnique(arr));
    }
    public static int findUnique(int[] arr) {
        // code here
        int num=0;
        for(int i : arr){
            num^=i;
        }
        return num;
    }
}
