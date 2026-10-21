public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        
        while (xor != 0) {
            count += xor & 1; // перевіряємо, чи останній біт дорівнює 1
            xor >>= 1;        // зсуваємо вправо на 1 біт
        }
        
        return count;
    }
}
