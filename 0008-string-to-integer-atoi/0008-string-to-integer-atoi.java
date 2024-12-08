class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0 || s.isEmpty())
            return 0;
        s = s.trim();
                if (s == null || s.length() == 0 || s.isEmpty()) return 0;
        StringBuilder str = new StringBuilder(); // removing whitespaces from end
        int i = 0;
        if (s.charAt(0) == '-')

        {
            str.append('-'); // checking if no is -ve or +ve
            i++;
        }
        if (s.charAt(0) == '+')
            i++;
        while (i < s.length() && s.charAt(i) == '0')
            i++;
        for (; i < s.length(); i++) {
            if (i < s.length() && Character.isDigit(s.charAt(i)))
                str.append(s.substring(i, i + 1));
            else
                break;
        }
        if (str.length() == 0 || (str.length() == 1 && str.charAt(0) == '-'))
            return 0;
        try {

            return Integer.parseInt(str.toString());
        } catch (NumberFormatException nfe) {
            if (str.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else {
                return Integer.MAX_VALUE;
            }
        }
    }
}