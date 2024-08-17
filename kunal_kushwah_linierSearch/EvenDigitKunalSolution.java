package kunal_kushwah_linierSearch;

public class EvenDigitKunalSolution {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumber(nums));
		System.out.println(digit(-5464));
		System.out.println(digit2(-5464));
	}

	static int findNumber(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num))
				count++;
		}
		return count;
	}

	static boolean even(int num) {
		int numOfDigit = digit(num);

		/*
		 * if(numOfDigit%2==0) { return true; } return false;
		 */

		return numOfDigit % 2 == 0;
	}
static int digit2(int num)
{
	if (num < 0) {
		num = num * -1;
	}
	return (int)(Math.log10(num)+1);
}
//count num of digit in the number
	static int digit(int num) {
		if (num < 0) {
			num = num * -1;
		}
		if (num == 0) {
			return 1;
		}
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
}
