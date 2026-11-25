// https://leetcode.com/problems/find-the-town-judge/
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1];

        for (int[] edge : trust) {
            int truster = edge[0];
            int trusted = edge[1];
            trustScore[truster]--;
            trustScore[trusted]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findJudge(2, new int[][]{{1, 2}}));
        System.out.println(solution.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        System.out.println(solution.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }
}
