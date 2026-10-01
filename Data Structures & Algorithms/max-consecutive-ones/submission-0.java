class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int c=nums[i];
            if(c==1){
              count++;
            }
            
            else{
                res=Math.max(res,count);
                count=0;

            }
        res=Math.max(res,count);
        }

    return res;
    }
}