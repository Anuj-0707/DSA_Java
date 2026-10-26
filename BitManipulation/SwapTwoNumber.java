/*Practice Questions: Bit Manipulation
Q1. Easy — Swap Two Numbers
- Swap two integers using XOR.
- Do not use a third variable. */
package BitManipulation;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int n1 = sc.nextInt();
        System.out.println("Enter num2");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Before Swapping");
        System.out.println(n1+" "+n2);
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
        System.out.println("After Swapping");
        System.out.println(n1+" "+n2);
    }
}
