/*Question: Check Whether a Number Is a Power of 2
Problem Statement:

Given an integer n, determine whether it is a power of 2. A number is a power of 2 if it can be expressed as \(2^k\), where \(k\) is a non-negative integer.

Print true if n is a power of 2; otherwise, print false.*/
package BitManipulation;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt(),ans=-1,ans2=0;
        sc.close();
        for(int i=31;i>=0;i--){
            if(((n>>i)&1)==1){
                ans = i;
                break;
            }
        }
        ans2 = 1<<ans;
        if(ans2==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}//Set Kth Bit
//Check set bit
//Unset Kth BIt
//Set the rightmost unset bit
//Power of 2(return (n&(n-1)==0))
