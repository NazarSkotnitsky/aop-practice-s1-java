// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPairs(new java.util.ArrayList<>(List.of(-1, 1, 2, 3, 1)), 2));
        System.out.println(solution.countPairs(new java.util.ArrayList<>(List.of(-6, 2, 5, -2, -7, -1, 3)), -2));
    }
}
