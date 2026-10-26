/*Question: Count Subsets With a Given Sum
Difficulty: Medium

You are given an integer array arr of length n and an integer target. Find the number of non-empty subsets whose elements sum to target.

Each element can be selected at most once. Subsets are considered different if they contain elements from different indices*/

package BitManipulation;
import java.util.ArrayList;
public class Subset {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        int[] arr ={0,8,5,4,6,3,2};
        int l = arr.length;
        int x = (int) Math.pow(2,l);
        for(int i=0;i<x;i++){
            ArrayList<Integer> li = new ArrayList<>();
            for(int j=0;j<l;j++){
                if(((i>>j)&1)==1){
                    li.add(arr[j]);
                }
            }
            list.add(li);
        }
        for(ArrayList<Integer> li : list){
            for(int i : li){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
