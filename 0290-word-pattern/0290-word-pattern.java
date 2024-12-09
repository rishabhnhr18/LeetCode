class Solution {
    public boolean wordPattern(String pattern, String s) {
        /*
         * approach 1
         * if(pattern.isEmpty() || s.isEmpty()) return false;
         * Set<Character> patternSet=new HashSet<>();
         * Set<String> sSet=new HashSet<>();
         * for(char c: pattern.toCharArray()) patternSet.add(c);
         * String [] str=s.split(" ");
         * for(String word: str) sSet.add(word);
         * return sSet.size()==patternSet.size();
         */

        /*
         * approach 2
         * if (pattern.isEmpty() || s.isEmpty())
         * return false;
         * String[] words = s.split(" ");
         * if (pattern.length() != words.length)
         * return false;
         * Map<String, Integer> wordMap = new HashMap<>();
         * Map<Character, Integer> patternMap = new HashMap<>();
         * for (int i = 0; i < words.length; i++) {
         * if (!wordMap.containsKey(words[i]))
         * wordMap.put(words[i], i);
         * if (!patternMap.containsKey(pattern.charAt(i)))
         * patternMap.put(pattern.charAt(i), i);
         * if (wordMap.get(words[i]) != patternMap.get(pattern.charAt(i)))
         * return false;
         * }
         * return true;
         */

        // approach 3
        if (pattern.isEmpty() || s.isEmpty())
            return false;
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        Map<String, Character> wordMap = new HashMap<>();
        Map<Character, String> patternMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (patternMap.containsKey(c)) {
                if (!patternMap.get(c).equals(word))
                    return false;
            }
            patternMap.put(c, word);
            if (wordMap.containsKey(word)) {
                if (!wordMap.get(word).equals(c))
                    return false;
            }
            wordMap.put(word, c);
        }
        return true;
    }
}