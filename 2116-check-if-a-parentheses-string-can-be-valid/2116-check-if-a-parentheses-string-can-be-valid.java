class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s==null || s.length()==0 || s.length()%2!=0) return false;
        int wildCard=0;
        int open=0;
        int close=0;
        for(int i=0; i<s.length(); i++)
        {
            if(locked.charAt(i)=='0') wildCard++;
            else if(s.charAt(i)=='(') open++;
            else close++;
            if(wildCard+open<close) return false;
        }
        wildCard=0;
        open=0;
        close=0;
        for(int i=s.length()-1; i>=0; i--)
        {
            if(locked.charAt(i)=='0') wildCard++;
            else if(s.charAt(i)=='(') open++;
            else close++;
            if(wildCard+close<open) return false;
        }
        return true;
    }
}