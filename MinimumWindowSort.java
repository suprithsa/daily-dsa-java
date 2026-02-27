public class MinimumWindowSort {
    public static int sort(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        // Step 1: find first out-of-order from left
        while (low < n - 1 && arr[low] <= arr[low + 1]) {
            low++;
        }

        if (low == n - 1) return 0; // already sorted

        // Step 2: find first out-of-order from right
        while (high > 0 && arr[high] >= arr[high - 1]) {
            high--;
        }

        // Step 3: find min and max in window
        int subMin = Integer.MAX_VALUE;
        int subMax = Integer.MIN_VALUE;

        for (int i = low; i <= high; i++) {
            subMin = Math.min(subMin, arr[i]);
            subMax = Math.max(subMax, arr[i]);
        }

        // Step 4: expand window left
        while (low > 0 && arr[low - 1] > subMin) {
            low--;
        }

        // Step 5: expand window right
        while (high < n - 1 && arr[high + 1] < subMax) {
            high++;
        }

        return high - low + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 10, 9, 12};
        System.out.println(sort(arr)); // Output: 5
    }
}