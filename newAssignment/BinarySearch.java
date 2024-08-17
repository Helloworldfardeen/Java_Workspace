package newAssignment;

public class BinarySearch {
	public static void main(String[] args) {
		int target = 786;
		int arr[] = { -1111, 1, 3, 4, 6, 8, 786 };
		int result = BS(arr, target);
		System.out.println(arr[result]);
	}

	public static int BS(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
