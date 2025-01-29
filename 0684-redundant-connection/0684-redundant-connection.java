class Solution {
    private int find(int dsuf[], int v)
    {
        if(dsuf[v]==-1) return v;
        return dsuf[v]=find(dsuf, dsuf[v]);
    }
    public int[] findRedundantConnection(int[][] edges) {
        if(edges==null || edges.length==0) return new int[0];
        int n=edges.length;
        int [] dsuf= new int[n+1];
        Arrays.fill(dsuf, -1);
        for(int edge[]: edges)
        {
            int x=find(dsuf, edge[0]);
            int y=find(dsuf, edge[1]);
            if(x==y) return edge;
            else dsuf[x]=y;
        }
        return new int[0];
    }
}