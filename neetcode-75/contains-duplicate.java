class Solution {
    public boolean containsDuplicate(int[] nums) {
        // use a hash set to view unique elements
        Set<Integer> seenElement = new HashSet<>();
        for (int n : nums) {
            // if the element is not added to the hash set, it means
            // it is not unique therefore a duplicate exists
            if (!seenElement.add(n)) { 
                return true;
            }
        }
        return false;
    }
}
