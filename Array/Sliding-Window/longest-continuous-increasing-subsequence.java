class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int max=1;
        for(int left=0;left<nums.length-1;left++){
           if(nums[left]<nums[left+1]){
            count++;
            max=Math.max(max,count);
           }
           else{
            count=1;
           }
        }
        return max;
    }
}