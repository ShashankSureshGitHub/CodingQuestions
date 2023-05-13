package com.practise;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 2, 4, 3 };
		int[] array2 = { 7, 9, 8, 6, 10 };
		int[] array3 = new int[array1.length + array2.length];
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i = 0, j = 0, k = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] <= array2[j]) {
				array3[k++] = array1[i++];
			} else {
				array3[k++] = array2[j++];
			}

		}
		if (i == array1.length) {
			while (j < array2.length) {
				array3[k++] = array2[j++];
			}
		}
		if (j == array2.length) {
			while (i < array1.length) {
				array3[k++] = array1[i++];
			}
		}

		for (int s : array3) {
			System.out.print(s + " ");
		}

	}

}
