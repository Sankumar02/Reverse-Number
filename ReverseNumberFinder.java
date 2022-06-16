package com.Task_14_04_22;

import java.util.Scanner;

public class ReverseNumberFinder {

	public static void main(String[] args) 
	{

		ReverseNumber rev = new ReverseNumber();
		
		Scanner reverse = new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed :");
		int number = reverse.nextInt();
		
		rev.reverseANumber(number);
	}

}
