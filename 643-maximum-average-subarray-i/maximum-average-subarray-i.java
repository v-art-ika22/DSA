class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum =0;
        for(int i=0;i<k;i++){
           sum+=nums[i];
        }
        double max = (double)sum/k;
       
        for(int i=0;i<nums.length-k;i++){
       
            sum-=nums[i];
            sum+=nums[k+i];
             max = Math.max(max,(double)sum/k);
        }
        return max;
    }
}