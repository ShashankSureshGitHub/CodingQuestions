package com.practise;

public class TargetElement {
	static int mid;

	public static void targetMethod(int[] arr, int low, int high, int target) {
		if (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == target) {
				System.out.println(target + " found at the position" + (mid + 1));
			} else if (arr[mid] > target) {
				targetMethod(arr, low, mid - 1, target);
			} else {
				targetMethod(arr, mid + 1, high, target);
			}
		} else {
			System.out.println(mid);
			if (arr[mid] < target)
				System.out.println(target + " is not found and should have been at the position " + (mid + 2));
			else
				System.out.println(target + " is not found and should have been at the position " + (mid + 1));
		}

	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 40, 50, 60 };
		int target = 45;
		int n = array.length;
		targetMethod(array, 0, n - 1, target);

	}

}
