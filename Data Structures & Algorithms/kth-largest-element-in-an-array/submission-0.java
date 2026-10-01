class Solution {
    public int findKthLargest(int[] nums, int k) {
        // int res=0;
        int n=nums.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            int c=nums[i];
            pq.add(c);
            if(pq.size()>k){
                pq.poll();
            }
        }
    return pq.peek();
    }
}
