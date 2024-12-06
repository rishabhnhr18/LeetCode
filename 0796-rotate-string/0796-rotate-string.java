class Solution {
    public boolean rotateString(String s, String goal) {
        if (s == null || goal == null || s.length() != goal.length())
            return false;
        if (s.equals(goal))
            return true;
        String str = s + s;
        return str.contains(goal);
    }
}