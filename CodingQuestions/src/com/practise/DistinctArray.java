package com.practise;

public class DistinctArray {

	public static void distinctElements(int[] arr, int n) {

		boolean flag = false;
		for (int i = 0; i < n; i++) {
			int j = i + 1;

			while (j < n) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
				j++;
			}

			if (flag == true) {
				System.out.println("Given array is not distinct");
				break;
			}
		}
		if (flag == false) {
			System.out.println("Given array is distinct");
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 20 };
		int n = array.length;
		distinctElements(array, n);
	}

}
