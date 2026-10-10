
import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();

        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                counts.push(num);
                strings.push(current);

                current = new StringBuilder();
                num = 0;
            }
            else if (ch == ']') {
                int count = counts.pop();
                StringBuilder previous = strings.pop();

                for (int i = 0; i < count; i++) {
                    previous.append(current);
                }

                current = previous;
            }
            else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
