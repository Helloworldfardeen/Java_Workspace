package assignment_Cloud;

import java.util.Scanner;

public class Assignment_problem3 {

	// Selection Sort
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	// Quick Sort
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public static void modifiedBubbleSort(int[] arr, int x) {
		int n = arr.length;
		int comparisons = 0;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				comparisons++;
			}
			if (!swapped)
				break;
		}
		int index = binarySearch(arr, x, comparisons);
		System.out.println("Index of " + x + " in sorted array: " + index);
		System.out.println("Number of comparisons: " + comparisons);
	}

	private static int binarySearch(int[] arr, int x, int comparisons) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				comparisons++;
				return mid;
			}
			if (arr[mid] < x) {
				comparisons++;
				low = mid + 1;
			} else {
				comparisons++;
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Size of Array");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter " + i + " element of Array");
			arr[i] = scanner.nextInt();
		}
		selectionSort(arr.clone());
		System.out.println("Selection Sort:");
		printArray(arr);
		quickSort(arr.clone(), 0, n - 1);
		System.out.println("Quick Sort:");
		printArray(arr);
		modifiedBubbleSort(arr.clone(), 5);
	}

	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
