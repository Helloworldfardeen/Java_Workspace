package day04;

public class ParenthesisMathingExtra {
	// {([a+b]*[c-d]/e}....
	public boolean CheckingMatching(String str) {
		ParenthesisMatchingCustomStack stak = new ParenthesisMatchingCustomStack(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stak.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				if (stak.empty()) {
					return false;
				}
				stak.pop();
			}
		}
		if (stak.empty()) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		ParenthesisMathingExtra met = new ParenthesisMathingExtra();
		boolean b = met.CheckingMatching("a(b[c]d)e{f(g)}");
		System.out.println(b);
	}
}
