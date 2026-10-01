class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int c=nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            int k=nums[i];
            if(map.get(k)>n/2){
                res=k;
            }
        }
    return res;
    }
}