class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fir=0;
        int sec=0;
        int ind=0;
        int n=numbers.length;
        // Arrays.sort(numbers);
        int low=0;
        int high=n-1;
        while(low<high){
         int sum=numbers[low]+numbers[high];
         if(sum==target){
            fir=low+1;
            sec=high+1;
            low++;
            high--;
         }
         else if(sum<target){
            low++;
         }
         else{
            high--;
         }
        }
    return new int[]{fir,sec};
    }
}
