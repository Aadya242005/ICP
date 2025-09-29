package lec3;
public class Set_matrix_zero {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        Zero(arr);
    }
    public static void Zero(int[][]arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean firstrow = false;
        boolean firstcol = false;
        //row
        for(int j=0;j<col;j++ ){
            if(arr[0][j]==0){
               firstrow =true;
               break;
            }
        }
        //col 
        for(int i=0;i<row;i++){
            if(arr[i][0]==0){
                firstcol = true;
                break;
            }
        }
        // diagonal
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
               
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }

            }
        }
        if(firstrow){
            for(int j=0;j<col;j++){
                arr[0][j]=0;

            }
        }
        if(firstcol){
            for(int i=0;i<row;i++){
                arr[i][0]=0;
            }
        }
    }
}
