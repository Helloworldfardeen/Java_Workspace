package day04;

import java.util.Stack;

public class ParenthesisMatching {

	public boolean MatchingFun(String str) {
		// (a+b)+a*(a-b)
		int result;
		Stack<Character> stck = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stck.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				if (stck.empty()) {
					return false;
				}
				stck.pop();

			}
		}
		if (stck.empty()) {
			return true;
		}

		else
			return false;
	}
	public boolean MatchingFunCustomStack(String str) {
		// (a+b)+a*(a-b)
		int result;
		ParenthesisMatchingCustomStack stck = new ParenthesisMatchingCustomStack(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stck.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				if (stck.empty()) {
					return false;
				}
				stck.pop();

			}
		}
		if (stck.empty()) {
			return true;
		}

		else
			return false;
	}
	public boolean PMathcing(String str)
	{
		Stack<Character> stck = new Stack<Character>();
		int count=0;
		for(int i = 0 ;i<str.length();i++)
		{
			if(str.charAt(i)==')'||str.charAt(i)=='(')
			{
				count++;
			}
		}
		return count%2==0;
		
	}

	public static void main(String[] args) {
		ParenthesisMatching check = new ParenthesisMatching();
		boolean result = check.MatchingFun("((a+b)*(c-d))");
		System.out.println("ParenthesisMatching::" + result);
		boolean result2 = check.PMathcing("((a+b)*(c-d))");
		System.out.println("ParenthesisMatching::" + result2);
		boolean result3 = check.MatchingFunCustomStack("((((a+b)*(c-d))))");
		System.out.println("ParenthesisMatching::" + result3);
	}

}
