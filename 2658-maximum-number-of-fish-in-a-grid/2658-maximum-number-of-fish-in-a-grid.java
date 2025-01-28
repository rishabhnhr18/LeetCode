class Solution {
    int rows;
    int cols;

    public int findMaxFish(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        this.rows = grid.length;
        this.cols = grid[0].length;
        int ans = 0, maxi = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]!=0) maxi=Math.max(maxi ,dfs(i, j, grid)); 
            }
        }
        return maxi;
    }

    private int dfs(int r, int c, int[][] grid) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0)
            return 0;
        int ans = grid[r][c];
        grid[r][c]=0;
        ans += dfs(r - 1, c, grid) + dfs(r + 1, c, grid) + dfs(r, c - 1, grid) + dfs(r, c + 1, grid);
        return ans;
    }
}