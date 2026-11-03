class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {
            int currentLength = word.length();
            for (int i = 0; i < currentLength; i++) {
                char c = word.charAt(i);
                // Наступна літера в алфавіті (якщо 'z', то можна обробити, але за умовами задачі зазвичай простіше)
                char nextChar = (c == 'z') ? 'a' : (char) (c + 1);
                word.append(nextChar);
                if (word.length() >= k) {
                    break;
                }
            }
        }
        
        return word.charAt(k - 1);
    }
}
