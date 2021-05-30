package com.backtracing;


public class QueenProblem {
	static int counter = 0;

	public static void main(String[] args) {
		

		QueenPermutation(new boolean[4], 2, 0,""); // arrangements matters
		
		QueenCombination(new boolean[4], 2, 0,"", -1); // arrangements does not matters
		// no duplicates in combination
	}
	
	public static void QueenPermutation(boolean[] boxes, int tq , int qpsf, String ans) {
		
		if(qpsf == tq) {
			System.out.println(++counter + ". "+ans);
			return;
		}
		
		for(int i =0; i < boxes.length ; i++) {
			
			 if(boxes[i] == false) {
				 boxes[i] = true;
				 QueenPermutation(boxes, tq , qpsf+1, ans + "q" + qpsf+ "b" +i+" ");
				 
				 // backtracking step undoing changes
				 boxes[i] = false;
			 }
			
		}
	}
	
public static void QueenCombination(boolean[] boxes, int tq , int qpsf, String ans, int lastBoxUsed) {
		
		if(qpsf == tq) {
			System.out.println(++counter + ". "+ans);
			return;
		}
		
		for(int i = lastBoxUsed +1; i < boxes.length ; i++) {
			
			 if(boxes[i] == false) {
				 boxes[i] = true;
				 QueenCombination(boxes, tq , qpsf+1, ans + "q" + qpsf+ "b" +i+" ", lastBoxUsed);
				 
				 // backtracking step undoing changes
				 boxes[i] = false;
			 }
			
		}
	}

}
