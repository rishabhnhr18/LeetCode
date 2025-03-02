class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int first = 0;
        int second = 0;
        int third = 0;
        int[][] arr = new int[nums1.length+nums2.length][2];
        while (first <nums1.length && second <nums2.length) {
            if (nums1[first][0] == nums2[second][0]) {
                arr[third][0] = nums1[first][0];
                arr[third][1] = nums1[first][1] + nums2[second][1];
                first++;
                second++;
            } else {
                if (nums1[first][0] < nums2[second][0]) {
                    arr[third][0] = nums1[first][0];
                    arr[third][1] = nums1[first][1];
                    first++;
                } else {
                    arr[third][0] = nums2[second][0];
                    arr[third][1] = nums2[second][1];
                    second++;
                }
                
            }
            third++;
        }

        while (first <= nums1.length - 1) {
            arr[third][0] = nums1[first][0];
            arr[third][1] = nums1[first][1];
            first++;
            third++;
        }
        while (second <= nums2.length - 1) {
            arr[third][0] = nums2[second][0];
            arr[third][1] = nums2[second][1];
            second++;
            third++;
        }

        return Arrays.copyOf(arr, third);

    }
}