// https://leetcode.com/problems/add-digits/
class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(38));
        System.out.println(solution.addDigits(0));
    }
}
