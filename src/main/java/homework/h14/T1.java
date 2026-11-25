// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
        System.out.println(solution.removeDuplicates("azxxzy"));
    }
}
