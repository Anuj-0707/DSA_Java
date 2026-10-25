/*Problem: Single Number III
Given an integer array arr, every element appears exactly twice except for two elements, which appear only once. Find those two unique elements.

You must solve the problem in \(O(n)\) time and \(O(1)\) extra space. */
package BitManipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,5,7,8,7};
        int l = arr.length;
        int num = 0;
        for(int i=0;i<l;i++){
            num^=arr[i];
        }
        //num = (num&(num-1))^num; // mask
        int lim=0;
        for(int i=0;i<32;i++){
            if(((num>>i)&1)==1){
                lim =i;
                break;
            }
        }
        int n =1;
        n=n<<lim;
        System.out.println(n);
        int a=0,b=0;
        for(int i=0;i<l;i++){
            if((arr[i]&n)==0){
                a^=arr[i];
            }
            else{
                b^=arr[i];
            }
        }
        System.out.println("Two numbers: "+a+" "+b);
    }
}
