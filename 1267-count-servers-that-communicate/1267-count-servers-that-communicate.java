class Solution {
    public int countServers(int[][] grid) {
    if(grid==null || grid.length==0) return 0;
    int rows=grid.length;
    int cols=grid[0].length;
    int []rowCount=new int[rows];
    int [] colCount=new int[cols];
    int totalServers=0;
    for(int i=0; i<rows; i++)
    {
        int freq=0;
        for(int j=0; j<cols;j++)
        {
            if(grid[i][j]==1)
            {
                rowCount[i]++;
                colCount[j]++;
                totalServers++;
            }
        }
    }
    //finding final communcationg servers
    for(int i=0; i<rows; i++)
    {
        int freq=0;
        for(int j=0; j<cols;j++)
        {
            if(grid[i][j]==1)
            {
                if(rowCount[i]<2 && colCount[j]<2) totalServers--;
            }
        }
    }        
    return totalServers;
    }
}