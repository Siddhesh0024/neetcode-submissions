class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            int c=nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int city:map.keySet()){
            if(map.get(city)>n/3){
                res.add(city);
            }
        }
    return res;
    }
}