package com.practise;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		/*
		 * StringBuffer newStr = new StringBuffer(str); System.out.println(newStr);
		 * newStr.reverse(); System.out.println(newStr);
		 */
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);

		if (str.equals(revString)) {
			System.out.println("Palindrome");
		}
		sc.close();

	}

}
