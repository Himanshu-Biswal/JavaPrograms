package CollectionFrameWork;

import java.util.Stack;

public class Collection_01_List_05_Stack_BalancedString {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);  // Push opening brackets
            } else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
                if (stack.isEmpty()) return false; // No matching opening bracket
                
                char top = stack.pop();//LIFO(Last In First Out)
                if (!isMatchingPair(top, ch[i])) return false; // Mismatched pair
            }
        }
        
        return stack.isEmpty(); // If stack is empty, it's balanced
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";  // Balanced ✅
        String test2 = "{[(])}";  // Not Balanced ❌
        String test3 = "{}]) ";    // Not Balanced ❌
        
        System.out.println(test1 + " -> " + isBalanced(test1));
        System.out.println(test2 + " -> " + isBalanced(test2));
        System.out.println(test3 + " -> " + isBalanced(test3));
    }
}
