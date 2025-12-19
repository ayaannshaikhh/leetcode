class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];
        pos[0] = -1;
        pos[1] = -1;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (pos[0] == -1) {
                    pos[0] = i;
                }
                
                if (pos[1] == - 1 || i > pos[1]) {
                    pos[1] = i;
                }
            }
        }
        return pos;
    }
}
