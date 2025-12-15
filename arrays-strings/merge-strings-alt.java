import java.util.*;
import java.lang.Math;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // put them into an array for easy iteration
        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        
        String merged = "";

        // determine the max
        int length = Math.max(wordArr1.length, wordArr2.length);

        for (int i = 0; i < length; i++) {
            if (i < wordArr1.length) {
                merged = merged + wordArr1[i];
            }
            
            if (i < wordArr2.length) {
                merged = merged + wordArr2[i];
            }
        }

        return merged;

    }
}
