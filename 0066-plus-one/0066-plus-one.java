class Solution {
    public int[] plusOne(int[] digits) {
        /*
         * Approach 1 (wrong for long numbers)
         * if(digits==null || digits.length==0) return null;
         * long sum=0;
         * StringBuilder str=new StringBuilder();
         * for(int i: digits) str.append(i);
         * sum=Long.parseLong(str.toString())+1;
         * String s=String.valueOf(sum);
         * int res[] =new int[s.length()];
         * int index=0;
         * for(char c: s.toCharArray())
         * {
         * if(index<res.length) res[index]=Integer.parseInt(String.valueOf(c));
         * index++;
         * }
         * return res;
         */

        // approach 2
        if (digits == null || digits.length == 0)
            return null;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[digits.length + 1];
        for (int i = 0; i < res.length; i++) {
            if (i == 0)
                res[0] = 1;
            else
                res[i] = 0;
        }
        return res;

    }
}