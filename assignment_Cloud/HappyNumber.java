package assignment_Cloud;

public class HappyNumber {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		while (start <= end) {
			if (isHappy(start)) {
				System.out.println(start + " is a Happy Number.");
			}
			start++;
		}
	}

	public static boolean isHappy(int num) {
		int first = num;
		int second = num;
		do {
			first = digitSquareSum(first);
			second = digitSquareSum(digitSquareSum(second));
		} while (first != second);
		return first == 1;
	}

	public static int digitSquareSum(int num) {
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}
}
