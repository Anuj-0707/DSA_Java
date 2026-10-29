package Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1,7,8,5,6,4,9,3,4};
        int target = 3;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at "+i+" index");
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Element  do not Exist");
    }
}
