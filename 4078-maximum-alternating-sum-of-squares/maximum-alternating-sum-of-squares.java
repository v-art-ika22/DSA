class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;int count=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
           
            ans+=Math.pow(nums[nums.length-i-1],2);

            ans-=Math.pow(nums[i],2);
            
        }
        if(nums.length%2!=0){
              ans+=Math.pow(nums[nums.length/2],2);
        }
        return ans;
    }
}