//Check Whether the K-th Bit Is Set
package BitManipulation;

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        if((n|(1<<k))==n){
            return true;
        }
        return false;
    }
}
