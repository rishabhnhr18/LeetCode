class Solution {
    public int minOperations(int[] nums, int k) {
        if(nums==null || nums.length<2) return 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int minOperations=0;
        for(long n: nums) pq.add(n);
        while(pq.size()>=2 && pq.peek()<k)
        {
            long a = pq.poll();
            long b= pq.poll();
            long n= ((Math.min(a, b)*2) + Math.max(a, b));
            pq.add(n);
            minOperations++;
        }
        return minOperations;
    }
}