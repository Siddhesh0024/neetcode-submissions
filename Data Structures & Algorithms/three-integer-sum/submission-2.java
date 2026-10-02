class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int target=0;
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<n-1;i++){
        int low=i+1;
        int high=n-1;
        if(i>0 && nums[i-1]==nums[i]){
            continue;
        }
        while(low<high){
         int sum=nums[low]+nums[high]+nums[i];
         if(sum==0){
            List<Integer>abc=new ArrayList<>();
            abc.add(nums[i]);
            abc.add(nums[low]);
            abc.add(nums[high]);
            res.add(abc);
            
             while(low<high && nums[low]==nums[low+1]){
            low++;
         }
         while(low<high && nums[high]==nums[high-1]){
            high--;
         }
         low++;
            high--;
         }
         else if(sum>target){
            high--;
         }
         else{
            low++;
         }
         
        }
       
        }
    return res;
    }
}
