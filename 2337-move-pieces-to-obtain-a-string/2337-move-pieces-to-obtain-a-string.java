class Solution {
    public boolean canChange(String start, String target) {
        if (start.equalsIgnoreCase(target))
            return true;
        if (start == null || target == null || start.length() != target.length())
            return false;
        int count1 = 0, count2 = 0;
        int i = 0, j = 0;
        for (; i < start.length() && j < target.length() ; i++, j++) {
            while ( i < start.length() && start.charAt(i) == '_')
                i++;
            while ( j < target.length() && target.charAt(j) == '_')
                j++;
            if (i == start.length() && j == target.length())
                return true;

            if (i == start.length() || j == target.length())
                return false;
            if (start.charAt(i) != target.charAt(j))
                return false;
            if (start.charAt(i) == 'L' && i < j)
                return false;
            if (start.charAt(i) == 'R' && i > j)
                return false;
        }
        while (i < start.length() && start.charAt(i) == '_') {
            i++;
        }
        while (j < target.length() && target.charAt(j) == '_') {
            j++;
        }

        return i == start.length() && j == target.length();
    }
}