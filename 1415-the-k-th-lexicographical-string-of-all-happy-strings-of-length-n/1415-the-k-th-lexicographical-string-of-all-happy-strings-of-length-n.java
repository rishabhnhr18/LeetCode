class Solution {
    public String getHappyString(int n, int k) {
        if(n==1){
            if(n==1 && k>3) return ""
            else if(n==1 && k==2) return "b";
            else return "c";
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("a");

    }
}