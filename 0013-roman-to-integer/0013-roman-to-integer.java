class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        if (s.length()== 0 || s == null)
            return 0;
        // Manually feeding data
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))
                sum -= m.get(s.charAt(i));
            else
                sum += m.get(s.charAt(i));
        }
        sum+=m.get(s.charAt(s.length()-1));
        return sum;
    }
}