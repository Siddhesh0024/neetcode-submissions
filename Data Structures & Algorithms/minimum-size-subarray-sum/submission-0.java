class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int sum=0;
        int low=0;
        for(int high=0;high<n;high++){
             sum=sum+nums[high];
             while(sum>=target){
               sum=sum-nums[low];
               int len=high-low+1;
               res=Math.min(len,res);
               low++;
             }
             
        }
    return res==Integer.MAX_VALUE?0 :res;
    }
}