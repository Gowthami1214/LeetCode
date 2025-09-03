class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            char current=num.charAt(i);
            while(!stack.isEmpty() && k>0 && stack.peek()>current){
                stack.pop();
                k--;
            }
            stack.push(current);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb=sb.reverse();
        sb=removeZeros(sb);
        if(sb.toString().equals("")){
            return "0";
        }
        else
        {
            return sb.toString();
        }
    }
    StringBuilder removeZeros(StringBuilder sb) {
    while (sb.length() > 0 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
    return sb;
}

}