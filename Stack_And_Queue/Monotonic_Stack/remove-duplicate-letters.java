class Solution {
    public String removeDuplicateLetters(String s) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];

        for (char c : s.toCharArray()) {

            count[c - 'a']--;

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && count[stack.peek() - 'a'] > 0) {

                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}