class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0)
            return "";
        Map<Character, Integer> m = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray())
            m.put(c, m.getOrDefault(c, 0) + 1); // count frequency of elements in strings
        List<Character> lst = new ArrayList<>(m.keySet()); // created a list containin set of unikeys keys of map
        lst.sort((a, b) -> m.get(b) - m.get(a)); // sorted by wrinting self written comparator function, sorting
                                                 // elements in decending order
        for (char c : lst) // iterating thoughtout the list containing unique elements
        {
            int count = m.get(c); // finding count of each unique element of list from map
            int i = 1;
            while (i <= count) {
                str.append(c); // appending the character count times
                i++;
            }
        }
        return str.toString();
    }

}