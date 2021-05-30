package com.recursion;

public class LastOccurrence {
	public static int lastOccurrence(int a[], int item, int vidx) {
		if(vidx == a.length)
			return -1;
		
		
		int sp = lastOccurrence(a,vidx+1,item);
		 
		if(a[vidx] == item && sp == -1)
			return vidx;
		return sp;
	}

	public static void main(String[] args) {
	

	}

}
