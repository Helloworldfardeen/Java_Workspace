package k_k_BinarySearchSearch;

public class BinarySearchOrderAnostic {
	public static void main(String[] args) {

		int arr[] = { 123, 456, 789, 101112, 131415 };
		int arrdes[] = { 131415, 101112, 789, 456, 123 };
		int target = 456;
		int ans = anosticBinarySeach(arr, target);
		System.out.println("The Binary Search for Ascending Order :: ");
		System.out.println("The Index value :: " + ans);
		int ans2 = anosticBinarySeach(arrdes, target);
		System.out.println("The Binary Search for Decending Order :: ");
		System.out.println("The Index value :: " + ans2);
	}

	public static int anosticBinarySeach(int ar[], int target) {
		int start, end, mid;
		start = 0;
		end = ar.length - 1;
		boolean isAsc = ar[start] < ar[end];
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (isAsc) {
				if (ar[mid] < target)//
				{
					start = mid + 1;
				} else if (ar[mid] > target) {
					end = mid - 1;
				} else {
					return mid;
				}
			} else {
				if (ar[mid] > target) {
					start = mid + 1;
				} else if (ar[mid] < target) {
					end = mid - 1;
				} else {
					return mid;
				}

			}
		}
		return -1;
	}
}