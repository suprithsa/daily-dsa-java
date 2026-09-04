class Solution {
    public int search(int[] nums, int target) {
       return binarysearch(nums,target,0,nums.length-1);
    }
    public int binarysearch(int[] nums,int target,int low ,int high){
        int mid = low+(high-low)/2;

        if(low>high){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        if(target>nums[mid]){
            return binarysearch(nums,target,mid+1,high);
        }
        else{
            return binarysearch(nums,target,low,mid-1);
        }
}
}