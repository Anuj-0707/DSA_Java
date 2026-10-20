/*You are given an \(m \times n\) binary matrix grid. You can perform two types of operations:
1. Flip a row: Change every 0 in a row to 1 and every 1 to 0.
2. Flip a column: Change every 0 in a column to 1 and every 1 to 0.
Your task is to maximize the sum of the scores of all rows after performing any number of these operations.

The score of a row is the decimal value of the binary number represented by that row.*/
package BitManipulation;

public class FlippingTheGrid {
    public static void main(String[] args) {
        //0th column of matrix should have all ones
        //har us col ko flip karo jisme no of zeros is grater than 1
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m = grid.length;//length of row
        int n = grid[0].length;//length of column
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j=0;j<n;j++){
                    grid[i][j]=(grid[i][j]^1);
                }
            }
        }
        for(int j=0;j<n;j++){
            int z =0,o=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==0){
                    z++;
                }else{
                    o++;
                }
            }
            if(z>o){
                for(int i=0;i<m;i++){
                    grid[i][j]=(grid[i][j]^1);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        int pow=1;
        for(int j=n-1;j>=0;j--){
            int o=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==1){
                    o++;
                }
            }
            sum+=pow*o;
            pow=pow*2;
        }
        System.out.println(sum);
    }
}
