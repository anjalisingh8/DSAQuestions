package com.function;

import java.util.Scanner;

public class Armstrong {
	public static void armstrong(int low, int high) {
		for(int i = low;i <= high; i++) {
			boolean res = isArmstrong(i);
			if(res == true)
				System.out.println(i);
		}
	}
	public static boolean isArmstrong(int n) {
		int count = 0;
		int on = n;
		while(on!= 0) {
			count++;
			on = on / 10;
		}
		int nod = count;
		int ans = 0;
		
	while(on!= 0) {
			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			on = on / 10;
		}
		if(ans == on)
		return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		armstrong(1,1000);
		scn.close();
	}

}
