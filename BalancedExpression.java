import java.util.Stack;

public class BalancedExpression {
    static Stack<Character> stack = new Stack<>();

    static void push(char c) {
        stack.push(c);
    }

    static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            stack.pop();
        }
    }

    static boolean isMatchingPair(char openb, char closeb) {
        return (openb == '{' && closeb == '}') ||
               (openb == '[' && closeb == ']') ||
               (openb == '(' && closeb == ')');
    }

    public static void main(String[] args) {
        char[] c = {'{', '[', '(', ')', '[', ']', ']', '}'};
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '{' || c[i] == '(' || c[i] == '[') {
                push(c[i]);
            } else if (c[i] == '}' || c[i] == ')' || c[i] == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Not closed properly");
                    return;
                }
                char topChar = stack.peek();
                if (isMatchingPair(topChar, c[i])) {
                    pop(); 
                }
            }
        }
        
        if (stack.isEmpty()) {
            System.out.println("Closed properly");
        } else {
            System.out.println("Not Closed properly");
        }
    }
}
/*
Write a Java program that checks if a given expression containing various types of parentheses ({}, (), []) is balanced. A balanced expression means that each opening parenthesis has a corresponding closing parenthesis and the pairs are properly nested.

Requirements:
Implement a method to push characters onto a stack.
Implement a method to pop characters from the stack.
Implement a method to check if two characters are matching pairs of parentheses.
Use a stack to process the input expression and check for balanced parentheses.
Print "Closed properly" if the expression is balanced.
Print "Not closed properly" if the expression is not balanced.
Input and Output:
Example 1:
Input: {[()]}
Output: Closed properly

Example 2:
Input: {[(])}
Output: Not closed properly

Example 3:
Input: {[}
Output: Not closed properly

Example 4:
Input: {[()]}
Output: Closed properly
 */
