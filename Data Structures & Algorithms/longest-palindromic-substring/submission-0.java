class Solution {
    public boolean isPalindrome(String s,int a,int b){
        int low=a;
        int high=b;
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    int len=j-i+1;
                    if(len>res.length()){
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
     return res;
    }
}
