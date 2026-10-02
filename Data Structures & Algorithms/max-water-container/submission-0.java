class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int Area=1;
        int low=0;
        int high=heights.length-1;
        while(low<high){
            int height=Math.min(heights[low],heights[high]);
            int width=high-low;
            Area=height*width;
            res=Math.max(Area,res);
            if(heights[low]>heights[high]){
                high--;
            }
            else{
                low++;
            }
        }
    return res;
    }
}
