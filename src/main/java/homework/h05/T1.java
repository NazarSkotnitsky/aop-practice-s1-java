import java.util.Arrays;

class Solution {
    // LeetCode Problem: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // (найбільший * передостанній) - (найменший * другий найменший)
        return (nums[n - 1] * nums[n - 2]) - (nums[0] * nums[1]);
    }
}
