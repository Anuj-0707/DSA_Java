/*Question: Reverse Bits
Problem Statement:

Given a 32-bit unsigned integer x, reverse its bits and return the resulting integer.

In other words, reverse the order of all 32 bits, including the leading zeros.*/
package BitManipulation;
public class ReverseBit {
    public static void main(String[] args) {
        long x = 32;
        long num = 0;
        for(int i=0;i<32;i++){
            if(((x>>i)&1)==1){
                num= (1L<<(31-i))|num;
            }
        }
        System.out.println(num);
    }
}
