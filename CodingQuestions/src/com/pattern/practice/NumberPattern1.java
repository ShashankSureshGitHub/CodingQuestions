package com.pattern.practice;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		sc.close();

	}

}
