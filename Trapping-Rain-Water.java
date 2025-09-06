class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                int width = i - left - 1;
                int h = Math.min(height[left], height[i]) - height[top];
                water += width * h;
            }
            stack.push(i);
        }
        return water;
    }
}
