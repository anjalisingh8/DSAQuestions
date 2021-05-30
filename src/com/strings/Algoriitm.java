package com.strings;

import java.util.Scanner;

public class Algoriitm {
	
public static boolean subsequence(String str, String str2, int m, int n){
        
        int j = 0;
         for(int i = 0; i < n && j < m; i++){

             if(str2.charAt(j) == str.charAt(i)){
                 j++;        
         }   
    }
         return(j == m);
    }

	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
        
        int testCase = scan.nextInt();
        
        while(testCase > 0){
            
            String str = scan.next();
            int m = str.length();
            
            
            String str2 = "algoriithm";
            int n = str2.length();
            
            boolean res = subsequence(str,str2,m,n);
        
            if(res)
            	System.out.println("yes");
            else
            	System.out.println("No");
            testCase--;
		
		scan.close();
	}
	}
}
