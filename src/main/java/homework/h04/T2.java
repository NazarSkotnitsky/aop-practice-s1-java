public class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;
        
        // Будуємо маску з одиниць потрібної довжини
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        return num ^ mask; // Інвертуємо біти під маскою
    }
}
