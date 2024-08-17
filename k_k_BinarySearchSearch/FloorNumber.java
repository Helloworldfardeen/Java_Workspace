package k_k_BinarySearchSearch;

public class FloorNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 1;
		System.out.println(FloorNumber(arr, target));

	}
//greatest number smaller than equal to target ..> smallest<=target
	public static int FloorNumber(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		int ans=0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
                 				
			} else if (arr[mid] > target) {//9>5
				end = mid - 1;
				ans = end;
			} else {
				return mid;
			}
		}
//		System.out.println("The number will be after that ::"+arr[end]);

		return end;
	}
}

