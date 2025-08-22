class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        int n=str.length;
        String res=str[n-1];
        return res.length();
    }
}