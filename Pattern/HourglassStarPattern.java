package Pattern;

public class HourglassStarPattern {
    public static void main(String[] args) {
        int n =7;
        int x =n/2+1;
        int y =2;
        for(int i=0;i<n;i++){
            if(x==0){
                for(int k=0;k<y;k++){
                    System.out.print("* ");
                }
                y++;
            }
            else{
                for(int j=0;j<x;j++){
                    System.out.print("* ");
                }
                x--;
            }
            System.out.println();
        }
    }
}
