package homework.h02;

// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class T2 {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        return num % 10 != 0;
    }
}
