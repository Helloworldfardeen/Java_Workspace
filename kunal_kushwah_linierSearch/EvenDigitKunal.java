package kunal_kushwah_linierSearch;

public class EvenDigitKunal {
	public static void main(String[] args) {
		int[] arr = { 12, 345, 2, 6, 7896 ,12};
		System.out.println(evenDigit(arr));
	}

	static boolean digit(int num) {
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		if (count % 2 == 0)
			return true;

		return false;
	}

	static int evenDigit(int arr[]) {
		int temp = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			if (digit(temp)) {
				cnt++;
			}

		}
		return cnt;
	}
}
