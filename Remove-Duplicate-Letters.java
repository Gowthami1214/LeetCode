class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack=new Stack<>();
        boolean[] visited=new boolean[26];
        int[] lastIndex=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<n;i++){
            char current=s.charAt(i);
            if(visited[current-'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>current && lastIndex[stack.peek()-'a']>i){
                char top=stack.pop();
                visited[top-'a']=false;
            }
            stack.push(current);
            visited[current-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}