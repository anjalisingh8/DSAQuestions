package com.timespace;

import java.util.Arrays;

public class SOE {
	public static void soe(int n) {
		boolean primes[] = new boolean[n+1];
		
		// sare elemnets ko man lo primes hai
		Arrays.fill(primes, true);
		
		// 0 And 1 prime nhi hai
		primes[0] = false;
		primes[1] = false;
		
		for(int table = 2 ; table * table <= n; table++) {
			
			if(primes[table] == false)
				continue;
			
			for(int mult = 2; table * mult <= n; mult++) {
				primes[table * mult] = false;
			}
			
			for(int i = 0; i <primes.length;i++) {
				if(primes[i])
					System.out.println(i);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
