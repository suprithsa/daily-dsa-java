class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int left =0;
        int max = 0;
        for(int right=0;right<k;right++){
            sum += nums[right];
            max=sum;
        }
        for(int right=k;right<nums.length;right++){
            sum -= nums[left];
             sum += nums[right];
             max=Math.max(max,sum);
             left++;
        }
        return (double)max/k;
    }
}