class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            int c=nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            int k=nums[i];
            if(map.get(k)>1){
                res=k;
            }
        }
    return res;
    }
}
