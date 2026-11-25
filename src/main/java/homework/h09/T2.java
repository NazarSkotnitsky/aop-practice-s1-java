// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(solution.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
