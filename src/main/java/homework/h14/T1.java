import java.util.ArrayDeque;

class Solution {
    public String removeDuplicates(String s) {
        // Використовуємо стек для збереження символів
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Якщо стек не порожній і верхній елемент дорівнює поточному — видаляємо його (ефект дублікатів)
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }
        
        // Збираємо результат із залишків у стеку
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast()); // Додаємо з кінця для збереження порядку
        }
        
        return sb.toString();
    }
}
