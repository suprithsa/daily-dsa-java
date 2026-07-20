class Solution {

    public int maxValue(int n, int index, int maxSum) {
        int low = 1;
        int high = maxSum;

        while (low < high) {
            int mid = low + (high - low + 1) / 2;

            long left = getSum(mid - 1, index);
            long right = getSum(mid, n - index);

            if (left + right <= maxSum) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private long getSum(long peak, int len) {
        if (peak >= len) {
            long first = peak - len + 1;
            return (first + peak) * len / 2;
        } else {
            return (peak + 1) * peak / 2 + (len - peak);
        }
    }
}