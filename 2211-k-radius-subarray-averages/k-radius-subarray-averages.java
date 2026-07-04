class Solution {
    public int[] getAverages(int[] nums, int k) {
        int winSize= 2*k+1;
        long sum =0;
        int[]arr = new int[nums.length];
        if(winSize>nums.length){
            Arrays.fill(arr,-1);
            return arr;
        }
        for(int i=0;i<winSize;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i-k<0||i+k>=nums.length){
                arr[i]=-1;
            }
            else{
                arr[i]=(int)(sum/winSize);
                sum-=nums[i-k];
                if(i+k+1<nums.length){
                sum+=nums[i+k+1];
                }
            }
        }
        return arr;
    }
}