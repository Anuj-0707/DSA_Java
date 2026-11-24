package Binary_Search;
public class prgm2 {
    public static void main(String[] args) {
        int[] arr = {-76,-4,9,28,47,510,615,9911,9999};
        int target = 47,result=0;
        int first_idx=0,last_idx=arr.length-1;
        while(first_idx<last_idx){
            int mid = (last_idx+first_idx)/2;
            if(arr[mid]==target){
                result=target;
		        break;
            }
            else if(arr[mid]>target){
                mid = first_idx;
            }
            else{
                last_idx=mid;
            }
        }
	    if(result == target){
	        System.out.println("True");
	    }
	    else{
	        System.out.println("False");
	    }
    } 
}