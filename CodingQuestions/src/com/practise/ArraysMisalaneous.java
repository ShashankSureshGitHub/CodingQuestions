package com.practise;

import java.util.Arrays;

public class ArraysMisalaneous {

	public static void main(String[] args) {

		// java code to find the largest and second largest element in an array

		int[] array = { 1, 5, 7, 8, 9, 2, 10, 20, 19, 18 };
		int largest = array[0];
		int secondLargest = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] >= largest) {
				largest = array[i];
				continue;
			}
			if (array[i] >= secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println("The largest element is: " + largest);
		System.out.println("The second largest element is: " + secondLargest);

		// sorting in ascending order
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		// sorting array in ascending order without using inbuilt function
		int temp = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j <= array.length-1; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		// sorting array in descending order
		int[] arr = { 1, 4, 2, 3, 5 };
		int temp1 = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] < arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;

				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
