class Solution {
    private boolean isValid(int x, int y, int rows, int cols) {
        return (x >= 0 && x < rows && y >= 0 && y < cols);
    }

    public int[][] highestPeak(int[][] isWater) {
        if (isWater == null || isWater.length == 0) {
            return new int[0][0];
        }

        int rows = isWater.length;
        int cols = isWater[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[][] heights = new int[rows][cols];

        Queue<int[]> queue = new LinkedList<>();

        // Initialize water cells with height 0 and enqueue them
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isWater[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        // Directions: up, down, left, right
        int[] dirs = {-1, 0, 1, 0, -1}; 

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];

                for (int d = 0; d < 4; d++) {
                    int newX = x + dirs[d];
                    int newY = y + dirs[d + 1];

                    if (isValid(newX, newY, rows, cols) && !visited[newX][newY]) {
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                        heights[newX][newY] = heights[x][y] + 1; 
                    }
                }
            }
        }

        return heights;
    }
}