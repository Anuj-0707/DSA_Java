package Pattern;
public class HollowTriangle {
    public static void main(String[] args) {
        int n =5;
        int sp =n-1;
        int x=1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int k=0;k<x;k++){
                if(k==0||k==x-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            sp--;
            x++;
        }
        for(int j=0;j<n;j++){
            System.out.print("* ");
        }
    }
}
