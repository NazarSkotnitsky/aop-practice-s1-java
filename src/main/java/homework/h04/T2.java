// https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        return num ^ mask;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findComplement(5));
        System.out.println(solution.findComplement(1));
    }
}
