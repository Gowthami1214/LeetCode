class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack =new Stack<>();
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<(2*n);i++){
            int index=i%n;
            int current=nums[index];
            while(!stack.isEmpty() && nums[stack.peek()]<current){
                int idx=stack.pop();
                res[idx]=current;
            }
            if(i<n){
                stack.push(index);
            }
        }
        return res;
    }
}