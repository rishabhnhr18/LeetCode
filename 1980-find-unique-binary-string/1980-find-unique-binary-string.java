import java.util.HashSet;
import java.util.Set;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length(); // Assuming all strings in nums have the same length
        Set<String> set = new HashSet<>();
        for (String s : nums) set.add(s);
        
        // Generate all possible binary strings of length n
        return generateBinaryString(n, set, "");
    }
    
    private String generateBinaryString(int n, Set<String> set, String current) {
        if (current.length() == n) {
            if (!set.contains(current)) {
                return current;
            }
            return null;
        }
        
        // Try adding '0' and '1' to the current string
        String result = generateBinaryString(n, set, current + "0");
        if (result != null) return result;
        
        result = generateBinaryString(n, set, current + "1");
        return result;
    }
}