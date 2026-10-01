class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int n=s.length();
        int low=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char l=s.charAt(low);
                int freq=map.get(l);
                map.put(l,freq-1);
                int newfreq=freq-1;
                if(newfreq==0){
                    map.remove(l);
                }
            low++;
            }
        int length=i-low+1;
        res=Math.max(length,res);
        }
    return res;
    }
}
