class Solution {
    public int numOfSubarrays(int[] arr) {
        /*
         * APPROACH 1 WRONG
         * int ans=0;
         * int [] oddEven = new int[arr.length];
         * int i=0;
         * int elementCount= 0;
         * for(int e:arr)
         * {
         * ans+=e;
         * if(ans%2==0)
         * {
         * oddEven[i]=1;
         * elementCount++;
         * }
         * else oddEven[i]=0;
         * i++;
         * }
         * if(elementCount == arr.length) return 0;
         * int count=0;
         * for(i=0; i<oddEven.length; i++)
         * {
         * if(oddEven[i]==0) //odd
         * {
         * for(int j=0; j<i; j++)
         * {
         * if(oddEven[j]==1) count++;
         * }
         * count++;
         * }
         * else
         * {
         * for(int j=0; j<i; j++)
         * {
         * if(oddEven[j]==1) count++;
         * }
         * }
         * }
         * return count;
         */
        // ---------------------------------------------------------------------

        /*
         * Approach 2
         * LOgic:
         * Just find the prefix sum array
         * if prefix Sum upto is
         * ODD - > count for even prefix sum bofore it and oadd one more as the current
         * sum upto now is odd
         * EVEN - > count for all odd prefix sum before it
         */
        int count = 0;
        if (arr == null || arr.length == 0)
            return 0;
        final int MOD = 1_000_000_007;

        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum % 2 == 0) // even prefixSUm, count for left side odd sums
            {
                count = (count + oddCount) % MOD;
                evenCount++;
            } else// odd prefixSUm, count for left side even sums +1
            {
                count = (count + evenCount) % MOD;
                count++;
                oddCount++;
            }
        }
        return count;
    }
}