package lec3;

public class No_of_islands {
    public static void main(String[] args) {
        int[][]arr = {
            {1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,0,0}

        };
        System.out.println(numIslands(arr));
    }

    public static int numIslands(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] vis = new boolean[rows][cols];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    dfs(i,j,grid,vis);
                    count++;
                }

            }
        }
        return count;

    }
     public static void dfs(int i, int j, int[][] grid, boolean[][] vis) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length 
            || grid[i][j] == 0 || vis[i][j]) {
            return;
        }

        vis[i][j] = true;

        dfs(i - 1, j, grid, vis); // up
        dfs(i + 1, j, grid, vis); // down
        dfs(i, j - 1, grid, vis); // left
        dfs(i, j + 1, grid, vis); // right
    }
}
