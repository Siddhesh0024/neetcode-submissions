class Solution {
    public int maxProduct(int[] nums) {
        int prod=nums[0];
        int ans=prod;
        int maxend=nums[0];
        int minend=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
         int v1=nums[i];
           int me= maxend*v1;
           int mine=minend*v1;
           maxend=Math.max(v1,Math.max(me,mine));
           minend=Math.min(v1,Math.min(mine,me));
           ans=Math.max(ans,Math.max(maxend,minend));
        }
    return ans;
    }
}
