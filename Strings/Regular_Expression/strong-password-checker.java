class Solution {
    public int strongPasswordChecker(String password) {

        int n = password.length();

        boolean lower = false;
        boolean upper = false;
        boolean digit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) lower = true;
            else if (Character.isUpperCase(ch)) upper = true;
            else if (Character.isDigit(ch)) digit = true;
        }

        int missingTypes = 0;

        if (!lower) missingTypes++;
        if (!upper) missingTypes++;
        if (!digit) missingTypes++;

        int replace = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < n;) {

            int j = i;

            while (j < n && password.charAt(j) == password.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (len >= 3) {
                replace += len / 3;

                if (len % 3 == 0) one++;
                else if (len % 3 == 1) two++;
            }

            i = j;
        }

        if (n < 6) {
            return Math.max(missingTypes, 6 - n);
        }


        if (n <= 20) {
            return Math.max(missingTypes, replace);
        }

        int delete = n - 20;
        int remainingDelete = delete;

      
        int use = Math.min(remainingDelete, one);
        replace -= use;
        remainingDelete -= use;

        use = Math.min(remainingDelete, two * 2);
        replace -= use / 2;
        remainingDelete -= use;

        
        replace -= remainingDelete / 3;

        return delete + Math.max(missingTypes, replace);
    }
}