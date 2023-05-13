package com.practise;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int total = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total = total + i;
			}

		}
		if (total == num) {
			System.out.println("The given number is a perfect number");
		} else {
			System.out.println("The given number is not a perfect number");
		}
		sc.close();

	}

}
