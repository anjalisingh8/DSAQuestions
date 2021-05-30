package com.array;

public class BarGraph {
	public static void barGraph(int a[]) {
		int row = maximum(a);
		int col = a.length;
		for(int r = 1; r<= row ;r++) {
			for(int c = 0; c< col;c++) {
				if(r <= row - a[c])
					System.out.println(" ");
				else
					System.out.println("*");
			}
		}
	}
	public static int maximum(int[] a) {

		return 0;
	}
	public static void main(String[] args) {
		

	}

}
