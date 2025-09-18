class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid+=1;
                low+=1;
            }
            else if(nums[mid]==1){
                mid+=1;
            }
            else
            {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;

                high-=1;
            }
        }   
    }
}