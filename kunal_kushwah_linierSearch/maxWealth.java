package kunal_kushwah_linierSearch;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class maxWealth {
	public static void main(String[] args) {
		int account[][] = { { 2, 3 ,7}, {5, 9, 6 }, {7, 5, 7 }, };
		System.out.println(custWealth(account));
	}

	public static int custWealth(int arr[][]) {
		System.out.println("Printing... the matrix....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		int ans ,temp =0,check=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
             ans=0;
			for (int j = 0; j < arr[i].length; j++) {
				ans = ans + arr[i][j];
			}
			if(ans>check) {
			temp=ans;
			check=temp;
		}

	}
		return temp;
}
}
