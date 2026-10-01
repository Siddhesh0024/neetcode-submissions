class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
          int c=nums[i];
          set.add(c);
        }
        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                res=i;
            }
        }
    return res;
    }
}
