class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return 0;
        if (nums1.length % 2 == 0 && nums2.length % 2 == 0)
            return 0;
        int ans = 0;
        if (nums1.length % 2 == 0) {
            for (int element : nums1) {
                ans ^= element;
            }
            return ans;
        } else if (nums2.length % 2 == 0) {
            for (int element : nums2) {
                ans ^= element;
            }
            return ans;
        } else {
            for (int element : nums1) {
                ans ^= element;
            }
            for (int element : nums2) {
                ans ^= element;
            }
        }
        return ans;
    }
}