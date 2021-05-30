package com.arrayList;

import java.util.ArrayList;

public class SumofTwoArrays {
	
	public static ArrayList<Integer> sumTwoArrays(int[] one, int[] two){
		
		ArrayList <Integer> res = new ArrayList<Integer>();
		
		int i = one.length-1;
		int j = two.length-1;
		int carry = 0;
		
		while(i >= 0 || j >= 0) {
			int sum = carry;
			if(i >= 0)
				sum += one[i];
			if(j >= 0)
				sum += two[j];
			
			int rem = sum % 10;
			res.add(0,rem) ;
			
			carry = sum /10;
			i--;
			j--;
		}
		if(carry > 0)
			res.add(0,carry);
		//1. reverse
		//2 or res.add(0,rem)
		//collections.reverse()
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = {9,8,7,5};
		int [] two = {9,6,7};
		
		System.out.println(sumTwoArrays(one,two));
		
		

	}

}
