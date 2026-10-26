/*Question: XOR of a Range
Difficulty: Easy

Given two integers L and R, find the XOR of all integers in the range [L, R], inclusive */
package BitManipulation;

public class XorOfRange {
    public static void main(String[] args) {
        int l=3,r=8;
        int x = (xor(l-1)^xor(r));
        System.out.println(x);
    }
    public static int xor(int n){
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }
        else{
            return n;
        }
    }
}
