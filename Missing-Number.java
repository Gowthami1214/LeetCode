class Solution {
    public int missingNumber(int[] nums) {
        int miss=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                miss=i;
                break;
            }
        }
        if(miss==-1){
            return nums[nums.length-1]+1;
        }
        else
        {
            return miss;
        }
    }
}