import java.util.List;
import java.util.Collections;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Сортуємо список для ефективного підрахунку пар (Two Pointers)
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // Якщо сума менша за target, то всі елементи від left до right 
                // у парі з nums.get(left) теж даватимуть суму меншу за target
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
}
