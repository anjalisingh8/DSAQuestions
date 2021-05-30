package com.backtracing;

public class CoinChange {

	static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int denom[] = {2,3,5,6};
		int amount = 10;
		
		CoinChangeCombination(denom,amount,"",0);
		
		System.out.println();
		System.out.println("Permutations");
		CoinChangePermutation(denom,amount,"");

	}

	public static void CoinChangeCombination(int[] denom , int amount, String ans, int lastdenomIndex) {
		
		if(amount == 0) {
			System.out.println("Amount 10 can be formed with  ----- "+ans);
			return;
		} 
		
		for(int i = lastdenomIndex; i < denom.length ; i++) {
			if(amount >= denom[i]) {
				CoinChangeCombination(denom, amount - denom[i] ,ans + denom[i] , i);
			}	
		}
	}
	
	
  public static void CoinChangePermutation(int[] denom , int amount, String ans) {
		
		if(amount == 0) {
			counter++;
			System.out.println( counter+".  Amount 10 can be formed with  ----- "+ans);
			return;
		} 
		
		for(int i = 0; i < denom.length ; i++) {
			if(amount >= denom[i]) {
				CoinChangePermutation(denom, amount - denom[i] ,ans + denom[i]);
			}	
		}
	}
}
