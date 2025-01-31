class Solution {
    int rows;
    int cols;

    private int dfs(int[][] grid, int r, int c, boolean[][] visited) {
        // Check boundaries and whether the cell is land (1) and not visited
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0 || visited[r][c]) {
            return 0;
        }
        // Mark the cell as visited
        visited[r][c] = true;
        // Initialize the size of the island
        int ans = 1;
        // Explore all 4 directions
        ans += dfs(grid, r - 1, c, visited) + dfs(grid, r + 1, c, visited) +
               dfs(grid, r, c - 1, visited) + dfs(grid, r, c + 1, visited);
        return ans;
    }

    public int largestIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0; // Return 0 for empty grid
        rows = grid.length;
        cols = grid[0].length;
        int maxIsland = 0;

        // First, find the size of all islands without changing any 0 to 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    boolean[][] visited = new boolean[rows][cols]; // Initialize visited array
                    maxIsland = Math.max(maxIsland, dfs(grid, i, j, visited));
                }
            }
        }

        // Now, try changing each 0 to 1 and see if it connects islands
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 1; // Change 0 to 1
                    boolean[][] visited = new boolean[rows][cols]; // Initialize visited array
                    maxIsland = Math.max(maxIsland, dfs(grid, i, j, visited));
                    grid[i][j] = 0; // Revert the change
                }
            }
        }

        return maxIsland;
    }
}