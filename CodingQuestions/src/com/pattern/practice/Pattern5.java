package com.pattern.practice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}
			for (int l = i; l > 1; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
