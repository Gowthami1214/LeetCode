class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=0;
        }   
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int poppedIndex=stack.pop();
                res[poppedIndex]=i-poppedIndex;
                
            }
            stack.push(i);
        }
        return res;
    }
}