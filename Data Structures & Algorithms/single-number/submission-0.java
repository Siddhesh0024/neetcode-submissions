class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int res=0;
        for(int i=0;i<n;i++){
            int c=nums[i];
           map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            int ci=nums[i];
            if(map.get(ci)==1){
                res=ci;
            }
        }
    return res;
    }
}
