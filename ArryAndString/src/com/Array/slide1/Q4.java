package com.Array.slide1;

//Q4.Wap find the most repeated element in array.
public class Q4 {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 1, 1, 1, 32, 4, 5, 4 };
		int store = 0;
		int cnt = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
				}
			}
			if (cnt > maxCount){
				maxCount = cnt;//4,2
				store = arr[i];
			}
			cnt = 0;

		}
		System.out.println("The most Repeated Element is::" + store);
		System.out.println("The Number of times ::" + maxCount);
	}
}
