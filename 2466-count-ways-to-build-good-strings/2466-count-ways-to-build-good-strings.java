/*class Solution {
    private int goodString(int current, int low, int high, int zero, int one)
    {
        if(current > high) return 0;  // limit exceeds
        int count = (current >=low && current <=high) ? 1:0; // if current is within range then it is a  valid string, else not
        count += goodString(current+zero, low, high, zero, one);
        count += goodString(current+one, low, high, zero, one);
        return count;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        return goodString(0, low, high, zero, one);
    }
}*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int mod = 1_000_000_007;
    private Map<Integer, Integer> memo = new HashMap<>();

    private int goodString(int current, int low, int high, int zero, int one) {
        if (current > high) return 0; // Out of range
        if (memo.containsKey(current)) return memo.get(current); // Use memoized result

        // Count current string if it is within the range [low, high]
        int count = (current >= low && current <= high) ? 1 : 0;

        // Add counts of valid strings from the current state
        count = (count + goodString(current + zero, low, high, zero, one)) % mod;
        count = (count + goodString(current + one, low, high, zero, one)) % mod;

        memo.put(current, count); // Memoize the result for this state
        return count;
    }

    public int countGoodStrings(int low, int high, int zero, int one) {
        return goodString(0, low, high, zero, one);
    }
}
