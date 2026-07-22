class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = 0;

        for (int candy : candies) {
            high = Math.max(high, candy);
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canAllocate(candies, k, mid)) {
                ans = mid;
                low = mid + 1; // Try for a larger answer
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canAllocate(int[] candies, long k, int each) {
        long count = 0;

        for (int candy : candies) {
            count += candy / each;
        }

        return count >= k;
    }
}