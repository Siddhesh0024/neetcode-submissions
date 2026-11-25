class Solution {
    public int[][] kClosest(int[][] points, int k) {
       int n=points.length;
       int[][]res=new int[k][2];
       int ind=0;
       PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Long.compare(b[0]*b[0]+b[1]*b[1],a[0]*a[0]+a[1]*a[1])); 
   
   for(int i=0;i<n;i++){
    pq.add(points[i]);
    while(pq.size()>k){
     pq.poll();
     }
   }
   while(!pq.isEmpty()){
    res[ind]=pq.peek();
    ind++;
    pq.poll();
   }
   return res;
    }
}
