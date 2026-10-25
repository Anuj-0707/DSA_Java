/*Question: Set the Rightmost Unset Bit
Problem Statement:

Given a non-negative integer n, set its rightmost unset bit (the rightmost bit that is 0) to 1 and return the resulting number. If all bits are already set, return n. */
package BitManipulation;

public class SetRightmostUnsetBit {
        public int setBit(int n) {
        // code here
        int ans = -1;
        for(int i=0;i<=31;i++){
            if(((n>>i)&1)==0){
                ans = i;
                break;
            }
        }
        return n|(1<<ans);
    }
}
