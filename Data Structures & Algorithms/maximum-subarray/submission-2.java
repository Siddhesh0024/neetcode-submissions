class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int maxs=nums[0];
        int sum=nums[0];
        for(int i=1;i<n;i++){
           sum=Math.max(nums[i],sum+nums[i]);
          
            res=Math.max(res,sum);
        }
    return res;
    }
}
