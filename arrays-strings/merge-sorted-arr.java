import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m + n];

        // sample run: 0, 1, 2
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }

        Arrays.sort(merged);

        for (int k = 0; k < m + n; k++) {
            nums1[k] = merged[k];
        }

    }
}