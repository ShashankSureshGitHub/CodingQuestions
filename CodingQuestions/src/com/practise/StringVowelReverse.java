package com.practise;

import java.util.Scanner;

public class StringVowelReverse {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a word");
			String s = sc.next();
			StringBuffer word = new StringBuffer(s);
			System.out.println(word);
			int[] index = new int[100];
			char[] vowel = new char[100];
			int j = 0;
			System.out.println(word);
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'A' || word.charAt(i) == 'a' || word.charAt(i) == 'E' || word.charAt(i) == 'e'
						|| word.charAt(i) == 'I' || word.charAt(i) == 'i' || word.charAt(i) == 'O'
						|| word.charAt(i) == 'o' || word.charAt(i) == 'U' || word.charAt(i) == 'u') {
					index[j] = i;
					vowel[j] = word.charAt(i);
					j++;
				}
			}
			int l = 0;
			int k = 2;
			System.out.println(index[1] + " " + vowel[1]);
			while (l < 3 && k >= 0) {
				word.setCharAt(index[l], vowel[k]);
				l++;
				k--;
				System.out.println(word);
			}
	
		}

	}

}
