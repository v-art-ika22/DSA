class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasEven =false; boolean hasOdd = false;int oc=0; int ec=0;
        
        for(int i:nums1){
            if(i%2==0){
                hasEven = true;
                ec++;
            }
            else{
                hasOdd = true;
                oc++;
            }
        }
        if(ec==nums1.length||oc==nums1.length){
            return true;
        }
        return hasEven&&hasOdd;
    }
}