// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countOdds(3, 7));
        System.out.println(solution.countOdds(8, 10));
    }
}
