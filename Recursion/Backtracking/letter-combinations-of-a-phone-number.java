import java.util.*;

class Solution {

    String[] phone = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        backtrack(digits, 0, new StringBuilder());

        return result;
    }

    void backtrack(String digits, int index, StringBuilder current) {

       
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = phone[digit];

        for (char ch : letters.toCharArray()) {

            current.append(ch);

            backtrack(digits, index + 1, current);

            current.deleteCharAt(current.length() - 1);
        }
    }
}
