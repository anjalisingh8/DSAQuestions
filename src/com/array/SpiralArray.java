package com.array;

public class SpiralArray {
	public static void Spiral(int[][] a) {
		int minrow = 0;
		int mincol  = 0 ;
		int maxrow = a.length -1 ;
		int maxcol = a[0].length - 1;
		int count = 0;
		int nel = a.length * a[0].length;
		while(count < nel) {
			//first col
			for(int r = minrow ; r <= maxrow ; r++) {
				System.out.println(a[r][mincol] + " ");
				count++;
			}
			mincol++;
			
			for(int c = mincol ; c <= maxcol ; c++) {
				System.out.println(a[maxrow][c] + " ");
				count++;
			}
			maxrow--;
			for(int r = maxrow ; r >= minrow ;r--) {
				System.out.println(a[r][maxcol]);
				count++;
			}
			maxcol--;
			
			for(int c = maxcol ; c>= mincol ; c--) {
				System.out.println(a[maxrow][c]);
				count++;
			}
			minrow++;
			
		}
		
	}

	public static void main(String[] args) {
		

	}

}
