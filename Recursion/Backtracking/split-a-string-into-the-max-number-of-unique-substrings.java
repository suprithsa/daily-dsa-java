class Solution {

    int ans = 0;

    public int maxUniqueSplit(String s) {

        Set<String> used = new HashSet<>();

        backtrack(s, 0, used);

        return ans;
    }

    void backtrack(String s, int index, Set<String> used) {

        if (index == s.length()) {
            ans = Math.max(ans, used.size());
            return;
        }

        for (int end = index + 1; end <= s.length(); end++) {

            String sub = s.substring(index, end);

            if (!used.contains(sub)) {

                used.add(sub);

                backtrack(s, end, used);

                used.remove(sub);
            }
        }
    }
}