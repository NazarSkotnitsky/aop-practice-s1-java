class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        
        // Перебираємо всі можливі пари (i, j)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Якщо елементи рівні та індекс i менший за j
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }
        
        return goodPairs;
    }
}
