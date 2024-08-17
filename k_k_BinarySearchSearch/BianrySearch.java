package k_k_BinarySearchSearch;

public class BianrySearch {
	public static void main(String[] args) {
		int arr[] = { -88, -33, 0, 10, 20, 30, 40, 45 };
		int target = -88;
		int ans = algoBS(arr, target);
		System.out.println("The Index Value :: " + ans);
	}

	public static int algoBS(int ar[], int target) {
		int start = 0, end = ar.length - 1, mid;
//         int mid = (start+end)/2;//but this is not a better aproach because interger value may exceed;
		while (start <= end) {
//			mid = 0;
			mid = start + (end - start) / 2;
			if (ar[mid] < target)// 10<45 ,20<45
			{
				start = mid + 1;// new start =
			} else if (ar[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
