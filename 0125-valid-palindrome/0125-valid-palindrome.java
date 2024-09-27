class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int p1 = 0, p2 = s.length() - 1;
        
        while (p1 < p2)
         {
            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);
            
            // Skip non-alphanumeric characters for p1
            if (!(Character.isDigit(c1) || Character.isAlphabetic(c1)))
            {
                p1++;
                continue;
            }
            
            // Skip non-alphanumeric characters for p2
            if (!(Character.isDigit(c2) || Character.isAlphabetic(c2))) 
            {
                p2--;
                continue;
            }
            
            // If the characters don't match, it's not a palindrome
            if (c1 != c2) 
            {
                return false;
            }
            
            // Move both pointers towards the center
            p1++;
            p2--;
        }
        
        return true;
    }
}
