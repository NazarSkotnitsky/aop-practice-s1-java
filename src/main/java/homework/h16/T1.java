// https://leetcode.com/problems/flood-fill/
import java.util.Arrays;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }
        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
            return;
        }
        if (image[r][c] != originalColor) {
            return;
        }

        image[r][c] = newColor;

        dfs(image, r - 1, c, originalColor, newColor);
        dfs(image, r + 1, c, originalColor, newColor);
        dfs(image, r, c - 1, originalColor, newColor);
        dfs(image, r, c + 1, originalColor, newColor);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] image1 = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        System.out.println(Arrays.deepToString(solution.floodFill(image1, 1, 1, 2)));

        int[][] image2 = {
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(solution.floodFill(image2, 0, 0, 0)));
    }
}
