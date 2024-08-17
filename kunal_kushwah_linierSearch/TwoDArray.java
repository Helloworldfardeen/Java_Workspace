package kunal_kushwah_linierSearch;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr = { { 32, 98, 9, 21, 1 },
				        { 24, 65, 85, 6, 7 }, 
				        { 95, 5, -99, 6, 36 }, 
				        { 77, 88, 44, 55, 2 } 
				       };
		int target = 2;// row[3],col[1];
		System.out.println(search2D(arr, target));
	}

	public static int search2D(int arr[][], int target) {
//	System.out.println(arr.length);
		System.out.println("Printing... the matrix....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length + 1; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("Returning... the Element....");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				int element = arr[row][col];
				if (element == target) {
					return element;
				}

			}
//			return 1;

		}
		return -1;
	}
}
