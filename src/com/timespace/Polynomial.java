package com.timespace;

public class Polynomial {
	public static int exponential(int base, int exponent) {
		int power = 1;
		while(exponent != 0) {
			power *= base;
			exponent--;
		}
		return power;
		
		
//		int mult = x;
//		int sum = 0;
//		for(int coeff = n ; coeff >= 1; coef--) {
//			sum+= coeff * mult;
//			mult = mult * x;
//		}
	}
	public static int sum(int base, int exponential) {
		int sum = 0;
		for(int i = 0 ; i < exponential; i++) {
			sum += i * exponential(base,exponential);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
