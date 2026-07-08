class Solution {
    public int getMaximumGold(int[][] grid) {
        boolean[][] arr = new boolean[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                max = Math.max(max,maxx(grid,i,j,0,arr));
            }
        }
        return max;
    }
    public int maxx(int[][] grid, int row,int col,int sum ,boolean[][] arr){
         if (row < 0 || row >= grid.length ||
            col < 0 || col >= grid[0].length ||
            grid[row][col] == 0 ||
            arr[row][col]) {
            return sum;
        }

        arr[row][col] = true;

        int max = sum + grid[row][col];

        max = Math.max(max, maxx(grid, row - 1, col, sum + grid[row][col], arr));
        max = Math.max(max, maxx(grid, row + 1, col, sum + grid[row][col], arr));
        max = Math.max(max, maxx(grid, row, col - 1, sum + grid[row][col], arr));
        max = Math.max(max, maxx(grid, row, col + 1, sum + grid[row][col], arr));

        arr[row][col] = false;   

        return max;
    }
}

