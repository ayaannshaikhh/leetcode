import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        String[] s1 = s.split("");
        String[] t1 = t.split("");
        Arrays.sort(s1);
        Arrays.sort(t1);

        boolean anagram = Arrays.equals(s1, t1);

        return anagram;
    }
}
