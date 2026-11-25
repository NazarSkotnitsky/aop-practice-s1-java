// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;

        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }

        return Math.max(negCount, posCount);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        System.out.println(solution.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        System.out.println(solution.maximumCount(new int[]{5, 20, 66, 1314}));
    }
}
