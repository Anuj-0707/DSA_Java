//Given an integer x, count the number of set bits (bits equal to 1) in its binary representation. Return the total number of set bits.
package BitManipulation;

public class CountSetBit {
    public static void main(String[] args) {
        int x =9,count=0;
        for(int i=0;i<=31;i++){
            if(((x>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
