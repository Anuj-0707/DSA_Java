package Binary_Search;

public class firstOccurranceNew {
    public static void main(String args[]){
        int[] arr = {1,1,2,2,2,3,4,6,7,7,7,7,8,9};
        System.out.println(binarysearch(arr,7));
    }
    public static int binarysearch(int[] arr, int k) {
        // Code Here
        int left=0, result=-1;
        int right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==k){
                result = mid;
                right=mid-1;
            }
            else if(arr[mid]>k){
                right=mid-1;
            }
            else if(arr[mid]<k){
                left=mid+1;
            }
        }
        return result;
    }
}
