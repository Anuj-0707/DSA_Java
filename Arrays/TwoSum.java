package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,-9,-3,5,-2,4,5,7,8};
        int target = 11;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+", "+j);
                    flag=true;
                }
            }
        }
        if(!flag) System.out.println("No Two Sum exist");
    }
}
