import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        
        // Знаходимо максимальну кількість цукерок серед усіх дітей
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        
        // Перевіряємо, чи буде у кожної дитини найбільше цукерок, якщо додати extraCandies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}
