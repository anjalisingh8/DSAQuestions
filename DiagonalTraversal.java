package com.array;

import java.util.Scanner;

public class DiagonalTraversal {
	public static void diagonal(int a[][]){

        for(int k = 0; k <= a.length-1; k++){
            int i = k;
            int j = 0;
            while(i>=0){
                    System.out.print(a[i][j]+" ");
                    i = i-1;
                    j = j+1;
                
            }
        }

        for(int k = 1; k <= a[0].length-1 ; k++){
            int i = a[0].length-1;
            int j = k;
            while(j <= a[0].length-1){
                System.out.print(a[i][j]+" ");
                i= i-1;
                j = j+1;
            }

        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int a[][] = new int[n][m];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++)
            a[i][j] = scan.nextInt();
        }

        diagonal(a);
        scan.close();
	}

}
