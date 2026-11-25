// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n + 1) / 2;
        int k = n / m;
        int divisibleSum = m * k * (k + 1) / 2;
        return totalSum - 2 * divisibleSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.differenceOfSums(10, 3));
        System.out.println(solution.differenceOfSums(5, 6));
        System.out.println(solution.differenceOfSums(5, 1));
    }
}
