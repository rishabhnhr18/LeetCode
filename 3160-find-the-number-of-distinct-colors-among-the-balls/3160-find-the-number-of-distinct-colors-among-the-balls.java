import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        // Map to store ball ID to its current color
        Map<Integer, Integer> ballToColor = new HashMap<>();
        // Map to store color to its frequency
        Map<Integer, Integer> colorCount = new HashMap<>();
        // Array to store the result after each query
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            // If the ball already has a color, decrement the count of the old color
            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                // If the count of the old color becomes 0, remove it from the map
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            // Update the ball's color
            ballToColor.put(ball, newColor);
            // Increment the count of the new color
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);

            // Store the number of distinct colors after this query
            ans[i] = colorCount.size();
        }

        return ans;
    }
}