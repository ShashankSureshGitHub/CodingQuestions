package com.practise;

public class Reverse {

	public static void main(String[] args) {
		int number = 1567;
		String string = "shank";

		// java code to reverse a number
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = (reverseNumber * 10) + number % 10;
			number = number / 10;
		}
		System.out.println(" The number after reversing is: " + reverseNumber);

		// java code to reverse a string

		String reverseString = "";
		char[] stringArray = string.toCharArray();
		for (int i = stringArray.length - 1; i >= 0; i--) {
			reverseString = reverseString + stringArray[i];
		}
		System.out.println("The reversed string is: " + reverseString);

		reverseString = "";

		// java code to reverse a string
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		System.out.println("The reversed string is: " + reverseString);

		// Program code to show string is immutable in java
		String s1 = "Shank";
		s1.concat("cat");
		System.out.println(s1);

		// reversing a string using stringBuffer

		StringBuffer s = new StringBuffer("Shashank");
		s.reverse();
		System.out.println(s);

		// palindrome in strings
		StringBuffer sb = new StringBuffer("mom");
		StringBuffer sb1 = sb.reverse();
		if (sb1.equals(sb)) {
			System.out.println("is a palindrome");
		}

	}

}
