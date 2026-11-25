// https://leetcode.com/problems/height-checker/
class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }

        int mismatches = 0;
        int currentHeight = 1;

        for (int h : heights) {
            while (count[currentHeight] == 0) {
                currentHeight++;
            }
            if (h != currentHeight) {
                mismatches++;
            }
            count[currentHeight]--;
        }

        return mismatches;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        System.out.println(solution.heightChecker(new int[]{5, 1, 2, 3, 4}));
        System.out.println(solution.heightChecker(new int[]{1, 2, 3, 4, 5}));
    }
}
