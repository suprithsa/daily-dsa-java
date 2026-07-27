class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {

        List<Integer>[] heights = new ArrayList[101];

        for (int i = 1; i <= 100; i++) {
            heights[i] = new ArrayList<>();
        }

        for (int[] rect : rectangles) {
            heights[rect[1]].add(rect[0]);
        }
        for (int i = 1; i <= 100; i++) {
            Collections.sort(heights[i]);
        }

        int[] ans = new int[points.length];

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int count = 0;

            for (int h = y; h <= 100; h++) {

                List<Integer> list = heights[h];

                if (list.isEmpty()) continue;

                int idx = lowerBound(list, x);

                count += list.size() - idx;
            }

            ans[i] = count;
        }

        return ans;
    }

    private int lowerBound(List<Integer> list, int target) {

        int left = 0;
        int right = list.size();

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) >= target)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}