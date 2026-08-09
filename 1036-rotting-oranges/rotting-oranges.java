class Solution {
    public int orangesRotting(int[][] grid) {
        int count=0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            boolean change = false;
            int size=q.size();
            for(int k=0;k<size;k++){
                int[] curr = q.poll();
                int i=curr[0];
                int j=curr[1];
                if(i>0){
                   if(grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    q.offer(new int[]{i-1,j});
                    change=true;
                   }
                }
                if(i<grid.length-1){
                   if(grid[i+1][j]==1){
                    grid[i+1][j]=2;
                     q.offer(new int[]{i+1,j});
                    change=true;
                   }
                }
                if(j>0){
                   if(grid[i][j-1]==1){
                    grid[i][j-1]=2;
                     q.offer(new int[]{i,j-1});
                    change=true;
                   }
                }
                if(j<grid[0].length-1){
                   if(grid[i][j+1]==1){
                     grid[i][j+1]=2;
                     q.offer(new int[]{i,j+1});
                    change=true;
                   }
                }
            }
            if(change){

                count++;
            }
          
           

            }
           

        
          for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return count;
    }
}