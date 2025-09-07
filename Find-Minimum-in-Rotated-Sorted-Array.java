class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1; 
        if(nums.length == 1) return nums[0];
        if(nums[0] < nums[nums.length - 1]) return nums[0];
        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                
                right = mid;
            }
        }
        return nums[left];
    }
}