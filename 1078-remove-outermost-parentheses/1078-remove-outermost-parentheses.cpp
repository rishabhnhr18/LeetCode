class Solution {
public:
    string removeOuterParentheses(string s) {
        int balance = 0;
        string returnString = "";
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == '(') {
                if (balance > 0)
                    returnString += s[i];
                balance++;
            } else {
                balance--;
                if (balance > 0)
                    returnString += s[i];
            }
        }
        return returnString;
    }
};