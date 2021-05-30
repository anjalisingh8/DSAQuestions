package com.array;

public class Kadane {
	public static int kadane(int a[]) {
		int sum = a[0];
		int max = a[0];
		for(int i = 0; i< a.length; i++) {
			sum = Math.max(sum + a[i], a[i]);
		}
		if(sum > max)
			max = sum;
			
		return max;
	}
	public static int circularMaxSum(int a[]){
		// Case 1 : CE are non-wrapping
		int ceNonWrapping  = kadane(a);
		
		//Case 2 : CE are wrapping
		
		int totalSum = 0;
		for(int i = 0 ; i <a.length ; i++) {
			totalSum += a[i];
			a[i] = -a[i];
		}
		int ncelementsSum = kadane(a);
		int ceWrapping  = totalSum + ncelementsSum;
		return Math.max(ceNonWrapping, ceWrapping);
		
	}
	public static void main(String[] args) {
		
	}

}
