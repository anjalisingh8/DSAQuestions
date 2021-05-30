package com.fundamentals.nagaroo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int counter = 2;
		int flag = 0;
		
		while(counter <= number-1) {
			if(number % counter == 0) {
				flag = 1;
			}
			counter++;
		}
		 if(number == 1)
			System.out.println(number +" is not a prime.");
		 else {
			 if(flag == 0)
				 System.out.println(number +" is  a prime number.");
			 else
				 System.out.println(number +" is not a prime number.");
		
		scan.close();
	}
	}
}
