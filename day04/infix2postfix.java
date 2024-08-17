package day04;

import java.util.Stack;

//public class infix2postfix {
//
//	public int precedence(char operator) {
//		if (operator == '^') {
//			return 3;
//		} else if (operator == '*' || operator == '/') {
//			return 2;
//		} else if (operator == '+' || operator == '-') {
//			return 1;
//		}
//
//		return -1;
//	}
//
//	public String infixToPostfix(char[] s) {
//		Stack<Character> st = new Stack<Character>();
//		String result = "";
//		for (int i = 0; i < s.length; i++) {
//			if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
//				result += s[i];
//			} else if (s[i] == '(') {
//				st.push(s[i]);
//			} else if (s[i] == ')') {
//				while (!st.empty() && st.peek() != '(') {
//					result += st.peek();
//					st.pop();
//				}
//				if (!st.empty()) {
//					st.pop();
//				}
//			} else {
//				while (!st.empty() && precedence(st.peek()) > precedence(s[i])) {
//					result += st.peek();
//					st.pop();
//				}
//				st.push(s[i]);
//			}
//			while (!st.empty()) {
//				result += st.peek();
//				st.pop();
//			}
//
//		}
//		return result;
//	}
//
//
//}
public String infix2Postfix(char[] s) {
    Stack<Character> st = new Stack<Character>();
    String result = "";

    for (int i = 0; i < s.length; i++) {
        if (Character.isLetter(s[i])) {
            result += s[i];
        } else if (s[i] == '(') {
            st.push(s[i]);
        } else if (s[i] == ')') {
            while (!st.isEmpty() && st.peek() != '(') {
                result += st.peek();
                st.pop();
            }
            if (!st.isEmpty()) {
                st.pop(); // Pop '(' from the stack
            }
        } else { // Operator encountered
            while (!st.isEmpty() && precedence(st.peek()) >= precedence(s[i])) {
                result += st.peek();
                st.pop();
            }
            st.push(s[i]);
        }
    }

    while (!st.isEmpty()) {
        result += st.peek();
        st.pop();
    }

    return result;
}


public static void main(String[] args) {
	char[] test = { '(', 'a', '-', 'b', '/', 'c', ')', '*', '(', 'a', '/', 'k', '-', 'l', ')' };
	infix2postfix obj = new infix2postfix();
	String str = obj.infixToPostfix(test); 
	System.out.println(str);
//		String ne = "eddsdfasdf";
//		for (int i = 0; i < ne.length(); i++) {
//			System.out.println(ne[i]);
//		}
}