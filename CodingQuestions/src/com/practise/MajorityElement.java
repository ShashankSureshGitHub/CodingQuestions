package com.practise;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 30, 10 };
		int size = array.length;
		Arrays.sort(array);
		for (int index : array)
			System.out.print(index + " ");

		int i = 0;
		int count = 1;
		while (i < size - 1) {

			if (array[i] == array[i + 1]) {
				count++;
				i++;
			} else {

				if (count > (size / 2)) {
					System.out.println(array[i] + "is the majority element in the given array with " + count
							+ " number of occurances");
					break;
				} else {
					count = 1;
					i++;
				}
			}
		}

		if (count > (size / 2)) {
			System.out.println(
					array[i] + "is the majority element in the given array with " + count + " number of occurances");
		} else {
			System.out.println("Enter an array with majority elemnt");
		}

	}
}
