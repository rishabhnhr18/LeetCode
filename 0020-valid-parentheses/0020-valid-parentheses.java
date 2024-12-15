class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return false;
        Stack<Character> stk = new Stack<>();
        if (s.charAt(0) == '(' || s.charAt(0) == '{' || s.charAt(0) == '[')
            stk.push(s.charAt(0));
        else
            return false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stk.push(s.charAt(i));
            else {
                char c;
                if (!(stk.isEmpty()))
                    c = stk.pop();
                else
                    return false;
                if (c == '(' && s.charAt(i) == ')')
                    continue;
                else if (c == '[' && s.charAt(i) == ']')
                    continue;
                else if (c == '{' && s.charAt(i) == '}')
                    continue;
                else
                    return false;
            }
        }
        if (stk.isEmpty())
            return true;
        else
            return false;
    }
}