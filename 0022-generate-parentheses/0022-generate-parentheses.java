class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        dfs(0, 0, "", n, answer);
        return answer;
    }

    private void dfs(int open, int close, String s, int size, List<String> answer) {
        if ((open == close) && ((open + close) == 2 * size)) {
            answer.add(s);
            return;
        }
        if (open < size)
            dfs(open+1, close, s + "(", size, answer);
        if (close < size && close<open)
            dfs(open, close+1, s + ")", size, answer);
    }
}