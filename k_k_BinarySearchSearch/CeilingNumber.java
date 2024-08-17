package k_k_BinarySearchSearch;

//ceiling of the number mean 
//example target is 3 so celing number will be all the number greater than eqaul to 3 5,9...smallest one is 3
//3 is the celling number
//when the loop is violated then start is our ceiling number
public class CeilingNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 19;
		System.out.println(celingNumber(arr, target));

	}
//smallest number greater than equal to target ..> smallest>=target
	public static int celingNumber(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		int ans=0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
                 ans = start;				
			} else if (arr[mid] > target) {//9>5
				end = mid - 1;
			} else {
				return mid;
			}
		}
//		System.out.println("The number will be before that ::"+arr[ans]);

		return start;
	}
}
