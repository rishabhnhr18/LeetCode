class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int count = 1;
        int ans = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int e : arr)
            set.add(e);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int first = arr[i];
                int second = arr[j];
                int length=0;
                if(set.contains(first + second)) length=2;
                while (set.contains(first + second)) {
                    int next= first+second;
                    first = second;
                    second = next;
                    length++;
                }
                maxLen = Math.max(length, maxLen);

            }
        }
        return maxLen;
    }
}