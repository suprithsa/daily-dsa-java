class Solution {
    public int splitArray(int[] nums, int k) {
        int  low =0;
        int high =0;

        for(int num:nums){
            low=Math.max(low,num);
            high += num;
        }

        while(low<high){
            int mid = low+(high-low)/2;

            if(istrue(nums,k,mid)){
                high=mid;
            }
            else{
                low = mid+1;
            }
        }
         return low;
    }
    private boolean istrue(int[] nums,int k,int maxsum){
        int sum =0;
        int subarray =1;

        for(int num:nums){
            if(num+sum<=maxsum){
                sum +=num;
            }
            else{
                subarray++;
                sum =num;
            }
        }
        return subarray<=k;
    }
}
