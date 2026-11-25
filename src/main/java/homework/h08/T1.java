// https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        System.out.println(solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}
