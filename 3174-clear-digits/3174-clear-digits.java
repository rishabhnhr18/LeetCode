class Solution {
    public String clearDigits(String s) {
/*
        Approach 1 incorrect
        char[] charArray = s.toCharArray();
        Map<Integer, Character> map = new HashMap<>();
        int i = 0;
        for (char c : charArray) {
            if (i < s.length()) {
                map.put(i, c);
                if (Character.isDigit(c)) {
                    for (int j = i; j >=0; j--) {

                        if (!Character.isDigit(map.get(j))) {
                            map.remove(j);
                            break;
                        }
                    }
                    map.remove(i);
                }
                i++;
            }
        }
        StringBuilder str = new StringBuilder();
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            str.append(entry.getValue());
        }
        return str.toString();
        */
        if(s==null || s.trim().length()==0) return "";
        Stack<Character> stack =new Stack<>();
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c)) stack.pop();
            else stack.push(c);
        }
        StringBuilder  str = new StringBuilder();
        for(char c: stack) str.append(c);
        return str.toString();
    }
}