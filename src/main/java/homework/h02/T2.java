// https://leetcode.com/problems/a-number-after-a-double-reversal/
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSameAfterReversals(526));
        System.out.println(solution.isSameAfterReversals(1800));
        System.out.println(solution.isSameAfterReversals(0));
    }
}
