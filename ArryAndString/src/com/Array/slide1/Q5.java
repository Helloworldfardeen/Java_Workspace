package com.Array.slide1;

//Q5.wap to find 2nd max without sorting
public class Q5 {
	public static void main(String[] args) {
		int[] arr = { 21, 65, 3, 23, 69 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			//understand tomorrow morning 24-05-2024
			 if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] < largest) {
	                secondLargest = arr[i];
	            }
		}
		System.out.println("MAx" + secondLargest);
	}

}
