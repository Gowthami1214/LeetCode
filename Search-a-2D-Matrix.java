class Solution {
    static boolean search(int [] arr,int target,int n){
        int low = 0,high = n-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target)
                low = mid+1;
            else 
                high = mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int low =0,high = matrix.length-1;
        int n= matrix[0].length;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target)
                return search(matrix[mid],target,n);
            else if(matrix[mid][0]>target)
                high = mid -1;
            else
                low = mid+1;
        }
        return false;
    }
}