class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=nums[i];
            if(c==target){
                return true;
            }
        }
    return false;
    }
}