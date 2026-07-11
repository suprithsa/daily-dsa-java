class Solution {
    public int maxProduct(int[] nums) {
        int minpro =nums[0];
        int maxpro=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxpro;
                maxpro=minpro;
                minpro=temp;
            }
        minpro=Math.min(nums[i],minpro*nums[i]);
        maxpro=Math.max(nums[i],maxpro*nums[i]);

        ans = Math.max(ans,maxpro);
        }
        return ans;
    }
}