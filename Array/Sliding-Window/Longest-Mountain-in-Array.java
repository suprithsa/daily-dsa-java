class Solution {
    public int longestMountainInArray(int[] nums) {
        int n = nums.length;
        int ans=0;
        int i=1;

        while(i<n-1){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                int left =i;
                int right =i;
            while(left>0 && nums[left]>=nums[left-1]){
                left--;
            }
            while(right<n-1 && nums[right]>=nums[right+1]){
                right++;
            }
            ans = Math.max(ans,right-left+1);
            i=right;
            }
            else{
                i++;
            }
        }
        return ans;

    }
}