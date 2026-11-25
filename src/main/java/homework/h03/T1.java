// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
            sum += s;
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.average(new int[]{4000, 3000, 1000, 2000}));
        System.out.println(solution.average(new int[]{1000, 2000, 3000}));
    }
}
