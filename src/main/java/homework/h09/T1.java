// https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0;

        for (int num : nums) {
            pairs += count[num];
            count[num]++;
        }

        return pairs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println(solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        System.out.println(solution.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}
