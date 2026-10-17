class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int res=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                count++;
            }
            else{
                res=Math.max(res,count);
                count=1;
            }
            res=Math.max(res,count);
        }
    return res;
    }
}
