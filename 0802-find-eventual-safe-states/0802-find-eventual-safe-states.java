class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        if(graph==null) return new ArrayList<>();
        int [] state=new int[graph.length];
        List<Integer> safeNodes=new ArrayList<>();
        for(int i=0; i<graph.length; i++)
        {
            if(dfs(graph, i, state)) safeNodes.add(i); 
        }
        return safeNodes;
   }
   private boolean dfs(int [][]graph, int node, int []state)
   {
        if(state[node]>0) return state[node]==2;
        state[node]=1;
        for(int next: graph[node])
        {
            if(state[next]==1 || !dfs(graph, next, state)) return false;
        }
        state[node]=2;
        return true;
   }
}