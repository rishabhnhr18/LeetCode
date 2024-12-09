class Solution {
    public int lengthOfLastWord(String s) {
        int lastCount=0;
        if(s.isEmpty() || s.trim().isEmpty()) return 0;
        s=s.trim();
        for(int i=s.length()-1 ; i>=0 && s.charAt(i)!=' '; lastCount++, --i);
        return lastCount;
    }
}