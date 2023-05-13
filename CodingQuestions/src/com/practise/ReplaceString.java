package com.practise;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = str.replaceAll("[^a-zA-Z]", "");
		str = str.replace('s', 'S');
		System.out.println(str);
	}

}
