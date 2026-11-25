// https://leetcode.com/problems/smallest-even-multiple/
class Solution {
    public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestEvenMultiple(5));
        System.out.println(solution.smallestEvenMultiple(6));
    }
}
