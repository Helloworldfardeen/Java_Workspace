package kunal_kushwah_linierSearch;

import java.util.Arrays;

public class TwoDArrayKunalSol {
	public static void main(String[] args) {
		int[][] arr = { { 32, 98, 9, 21, 1 },
				        { 24, 65, 85, 6, 7 }, 
				        { 95, 5, -99, 6, 36 }, 
				        { 77, 88, 44, 55, 2 } 
				       };
		int target = 2;// row[3],col[1];
		int ans[]=search2D(arr, target);
//		System.out.println(ans);// it will show address...
		System.out.println(Arrays.toString(ans));// for formating [row,column]...
	    System.out.println(Maxsearch2D(arr));
	}

	public static int[] search2D(int arr[][], int target) {
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
				if (arr[row][col] == target) {
					System.out.println(element);
					return new int[]{row,col};  //--> you can create an object using new keyword below  also.<--
				}

			}

		}
		return new int [] {-1,-1};
	}

	public static int Maxsearch2D(int arr[][]) {
        
		System.out.println("Returning...MAX...the Element....");
		int max=Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
			          max=arr[row][col];
		  
				}

			}

		}
		return max;
	}
}
