// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k - 1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kthCharacter(5));
        System.out.println(solution.kthCharacter(10));
    }
}
