class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]res=new int[k];
        int n=nums.length;
        int ind=0;
         HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b)));
        for(int i=0;i<n;i++){
            int c=nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int num:map.keySet()){
            pq.add(num);
            while(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            int c=pq.poll();
            res[ind]=c;
            ind++;
           
        }
    return res;
    }
}
