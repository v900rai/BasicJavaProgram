package edu.selfpractice.programing.string;

import java.util.Scanner;

public class PrinttTheGivenName 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Name");
		System.out.println("------------------");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0; i<=str.length()-1; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
	}

}
