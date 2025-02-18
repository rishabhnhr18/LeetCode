class Solution {
    public String smallestNumber(String pattern) {
        if (pattern == null || pattern.length() == 0)
            return "";
        /*
         * int num =1;
         * StringBuilder str= new StringBuilder ();
         * Stack <Integer> stk = new Stack <>();
         * for(int i=0; i<=pattern.length(); i++)
         * {
         * if(pattern.charAt(i)=='I'){
         * stk.push(num);
         * num++;
         * str.append(stk.pop());
         * }
         * else{
         * int [] arr =new int[2];
         * arr=helper(i, stk, pattern, num);
         * i=arr[0];
         * num=arr[1];
         * while(!stk.isEmpty()) str.append(stk.pop());
         * }
         * }
         * return str.toString();
         * }
         * private int[] helper(int index, Stack<Integer> stk, String pattern, int num){
         * while(pattern.charAt(index)=='D' && index<pattern.length() && num<=9){
         * stk.push(num);
         * num++;
         * index++;
         * }
         * int arr[] = new int[2];
         * arr[0]=index;
         * arr[1]=num;
         * return arr;
         * }
         */

        /*
         * int num = 1;
         * StringBuilder str = new StringBuilder();
         * Stack<Integer> stk = new Stack<>();
         * for (int i = 0; i < pattern.length(); i++) {
         * if(pattern.length()=='I'){
         * while(pattern.charAt(i)=='I' && i<=pattern.length())
         * {
         * str.append(num++);
         * i++;
         * }
         * }
         * else{
         * while(pattern.charAt(i)=='D' && i<pattern.length())
         * {
         * stk.push(num++);
         * i++;
         * }
         * }
         * while(!stk.isEmpty()) str.append(stk.pop());
         * if(i==pattern.length()) return str.toString();
         * }
         * return str.toString();
         */
        int num = 1;
        StringBuilder str = new StringBuilder();
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            stk.push(num++);
            if (i == pattern.length() || pattern.charAt(i) == 'I')
                while(!stk.isEmpty()) str.append(stk.pop());
        }
        return str.toString();
    }
}