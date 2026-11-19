package Pattern;

public class AlternatingZigzagDiamondStarPattern {
    public static void main(String[] args) {
        int x = 12;
        int m = x/2;
        int n = x-m;
        int t =1;
        for(int i=0;i<x;i++){
            if(t<=m){
                for(int j=0;j<t;j++){
                    if(i%2!=0 && j%2==0){
                        System.out.print("  ");
                    }
                    else if(i%2==0 && j%2!=0){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                t++;
            }
            else{
                for(int j=0;j<n;j++){
                    if(i%2!=0 && j%2==0){
                        System.out.print("  ");
                    }
                    else if(i%2==0 && j%2!=0){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                n--;
            }
            System.out.println();
        }
    }
}
