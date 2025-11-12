class Solution {
    public boolean isBalanced(String num) {
        char[] str=num.toCharArray();
        long even=0,odd=0;
        for(int i=0;i<num.length();i++){
            int digit = str[i] - '0';
            if(i%2==1){
                odd+=digit;
            }
            else
            {
                even+=digit;
            }
        }
        return even==odd;
    }
}