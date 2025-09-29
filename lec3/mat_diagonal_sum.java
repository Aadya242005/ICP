package lec3;

public class mat_diagonal_sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{3,2,1}};
        System.out.print(diagonalSum(mat));
        
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int row = mat.length;
        int col = mat[0].length;
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j || i+j==n-1 ){
                    sum = sum+mat[i][j];

                }
            }
        }
        return sum;
        
    }
    
}
