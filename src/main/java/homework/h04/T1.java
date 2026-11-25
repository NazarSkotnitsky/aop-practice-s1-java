// https://leetcode.com/problems/hamming-distance/
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(1, 4));
        System.out.println(solution.hammingDistance(3, 1));
    }
}
