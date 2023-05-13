package com.pattern.practice;

public class DistinctElements {

	public static void frequency(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}

			}

			if (flag == true) {
				continue;
			}
			for (int k = i - 1; k >= 0; k--) {
				if (arr[i] == arr[k]) {
					count++;
				}
			}
			if (count == 0)
				System.out.println(arr[i] + "is a distinct element");
		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 30, 10, 40 };
		frequency(arr, arr.length);

	}
}
