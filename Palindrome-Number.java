class Solution {
    public boolean isPalindrome(int x) {
        int rev=x;
        int res=0;
        if(rev<0){
            return false;
        }
        while(rev!=0){
            int r=rev%10;
            rev/=10;
            res=res*10+r;
        }
        if(x==res){
            return true;
        }
        else
        {
            return false;
        }
    }
}