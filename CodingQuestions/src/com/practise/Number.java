package com.practise;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	StringBuffer s=new StringBuffer();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			s.append(j);
		}
		for(int k=i-1;k>=1;k--)
		{
			s.append(k);
		}
		s.append(" ");
	}
	System.out.println(s);
}
	
}
