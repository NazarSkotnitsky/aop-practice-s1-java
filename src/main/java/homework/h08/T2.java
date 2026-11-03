import java.util.List;
import java.util.Collections;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Сортируем список для эффективного подсчета пар (Two Pointers)
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // Если сумма меньше target, то все элементы от left до right 
                // в паре с nums.get(left) тоже будут давать сумму меньше target
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
