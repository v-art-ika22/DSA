class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][]arr1 = new int[image.length][image[0].length];
        boolean[][] arr = new boolean[arr1.length][arr1[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                arr1[i][j]=image[i][j];
            }
        }
        fill(arr,arr1,sr,sc,color,arr1[sr][sc]);
        return arr1;
        }
    
    public void fill(boolean[][] arr, int[][] image, int sr,int sc, int color,int original){
        if(image[sr][sc]!=original){
            return;
        }
       
        
        if(arr[sr][sc]==true){
            return;
        }
        arr[sr][sc]=true;
        image[sr][sc]=color;
        if(sr>0){
            fill(arr,image,sr-1,sc,color,original);
        }
        if(sr<image.length-1){
            fill(arr,image,sr+1,sc,color,original);
        }
        if(sc>0){
            fill(arr,image,sr,sc-1,color,original);
        }
        if(sc<image[0].length-1){
            fill(arr,image,sr,sc+1,color,original);
        }
       arr[sr][sc]=false;
    }
}