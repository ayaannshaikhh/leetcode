import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        String normal = Integer.toString(x);
        String reversed = "";

        for (int i = 0; i < normal.length(); i++) {
            reversed = normal.charAt(i) + reversed;
        }

        if (normal.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
