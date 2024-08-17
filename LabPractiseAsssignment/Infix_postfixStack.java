package LabPractiseAsssignment;

import java.util.Stack;

public class Infix_postfixStack {

	// Function to get precedence of operators
	public static int precedence(char operator) {
		switch (operator) {
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return -1;
		}
	}

	// Function to convert infix expression to postfix expression
	public static String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);

			
			if (Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}
			
			else if (ch == '(') {
				stack.push(ch);
			}
			else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				if (!stack.isEmpty() && stack.peek() != '(') {
					return "Invalid Expression"; // Unbalanced parentheses
				} else {
					stack.pop(); // Pop '(' from the stack
				}
			}
			// If an operator is encountered
			else {
				while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		// Pop all the remaining operators from the stack
		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				return "Invalid Expression"; // Unbalanced parentheses
			}
			postfix.append(stack.pop());
		}

		return postfix.toString();
	}

	public static void main(String[] args) {
		String infix = "(a-b/c)*(a/k-l)";
		System.out.println("Infix expression: " + infix);
		System.out.println("Postfix expression: " + infixToPostfix(infix));
	}

}
