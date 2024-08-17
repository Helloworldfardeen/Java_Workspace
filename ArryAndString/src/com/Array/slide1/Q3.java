package com.Array.slide1;

//Q3. Write a Java program to find the common elements between two arrays.
public class Q3 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 32, 4, 65, 9 };
		int[] arr2 = { 2, 5, 3, 98, 76, 6 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
                   System.out.println("The Common Element __"+arr1[i]);
				}
				else {
					System.out.println("there Is No Common Element");
				}
			}
		}
	}
}
