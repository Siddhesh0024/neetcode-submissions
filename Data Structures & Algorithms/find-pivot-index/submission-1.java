class Solution {
    public int pivotIndex(int[] nums) {
        int res=-1;
        int n=nums.length;
        int[]pref=new int[n];
        int[]suff=new int[n];
        pref[0]=0;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i-1];
        }
        int sum=0;
        for(int i=1;i<n;i++){
            sum=sum+nums[i];
        }
        suff[0]=sum;
        for(int i=1;i<n;i++){
            suff[i]=suff[i-1]-nums[i];
        }
        for(int i=0;i<n;i++){
            if(suff[i]==pref[i]){
                res=i;
                break;
            }
        }
    return res;
    }
}