package com.Task_14_04_22;

import java.util.Scanner;

public class ReverseNumber {

	// ----------------------------Using Scanner class-------------------------------
	
	int rev;
	public void reverseANumber(int number)
	{
		while (number != 0)
		{
			rev = rev * 10 + number % 10;
			
			number = number / 10;
		}
		System.out.println("Revered Number is :" + rev);
	}

	

	
	
	
	// ------Using Constructor------------------------------------------

//	int number,rev;
//
//	public ReverseNumber(int number) {	
//		this.number = number;
//	}
//	
//	public void reverseANumber() {
//		System.out.println("Enter the number to be reversed :"+number);
//		while(number != 0) {
//			rev = rev *10 + number % 10;
//			number = number /10;
//		}
//		System.out.println("Revered Number is :"+rev);
//	}
//	
//	public static void main (String [] args) {
//		
//		ReverseNumber rev =new ReverseNumber(1234);
//		
//		rev.reverseANumber();
//	}

//-------------------USing algorithm--------------------------------
//	public static void main(String[] args) {
//		int num = 1234;
//		int reverse = 0;
//		while(num != 0) {
//			reverse = reverse * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println("Reversed number is : "+reverse);
//	}
//

}
