//It calculates the minimum number of bit flips required to convert start = 255 into goal = 45 using XOR.
package BitManipulation;

public class ChangeNumber {
    public static void main(String[] args) {
        int count=0;
        int start =  255, goal = 45;
        int x = start ^ goal;
        for(int i=0;i<=31;i++){
            if(((x>>i)&1)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
