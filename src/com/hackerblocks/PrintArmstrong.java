//package com.hackerblocks;
//
//public class PrintArmstrong {
//	
//
//}
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        // Your Code Here
//        Scanner scan = new Scanner(System.in);
//        int low = scan.nextInt();
//        int high = scan.nextInt();
//               
//            for(int i = low; i<= high; i++){
//                int nod = 0;
//                int number = 0;
//                int temp = i;
//                while(temp != 0){
//                    temp = temp / 10;
//                    nod++;
//                }
//                temp = i;
//                while(temp != 0){
//                    int rem = temp % 10;
//                    temp = temp / 10;
//                    number += (int) Math.pow(rem,nod);
//                }
//                if(number == i)
//                System.out.println(i);
//            }
//
//    }
//}
//
//
//
//
//
//
//
//
////Manmohan loves pattern 2
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int row = 1;
//        int nst = 1;
//        System.out.println(1);
//        while(row<=n-1){
//            for(int cst = 1; cst <= nst+1; cst++){
//                if(cst == 1 || cst == nst+1)
//                System.out.print(row);
//                else
//                System.out.print("0");
//            }
//            System.out.println();
//            row++;
//            nst++;
//        }
//
//    }
//}
//
//
////Lower uppercase
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        char ch = scan.next().charAt(0);
//        if(ch >= 'a' && ch <= 'z')
//        System.out.println("lowercase");
//        else if(ch >= 'A' && ch <= 'Z')
//        System.out.println("UPPERCASE");
//        else
//        System.out.println("Invalid");
//
//    }
//}
//
//
////double sided arrow
//import java.util.*;
//public class Main {
//    static void drawPattern(int N) 
//    { 
//        int n = N; 
//        int row = 1; 
//  
//        // 'nst' is the number of values 
//        int nst = 1; 
//  
//        // 'nsp' is the number of spaces 
//        int nsp1 = n - 1; 
//        int nsp2 = -1; 
//        int val1 = row; 
//        int val2 = 1; 
//  
//        while (row <= n) { 
//  
//            // Here spaces are printed 
//            // 'csp' is the count of spaces 
//            int csp1 = 1; 
//            while (csp1 <= nsp1) { 
//                System.out.print("  "); 
//                csp1 = csp1 + 1; 
//            } 
//  
//            // Now, values are printed 
//            // 'cst' is the count of stars 
//            int cst1 = 1; 
//            while (cst1 <= nst) { 
//                System.out.print(val1 + " "); 
//                val1 = val1 - 1; 
//                cst1 = cst1 + 1; 
//            } 
//  
//            // Again spaces have to be printed 
//            int csp2 = 1; 
//            while (csp2 <= nsp2) { 
//                System.out.print("  "); 
//                csp2 = csp2 + 1; 
//            } 
//  
//            // Again values have to be printed 
//            if (row != 1 && row != n) { 
//                int cst2 = 1; 
//                while (cst2 <= nst) { 
//                    System.out.print(val2 + " "); 
//                    val2 = val2 + 1; 
//                    cst2 = cst2 + 1; 
//                } 
//            } 
//            System.out.println(); 
//  
//            // Move to the next row 
//            if (row <= n / 2) { 
//                nst = nst + 1; 
//                nsp1 = nsp1 - 2; 
//                nsp2 = nsp2 + 2; 
//                val1 = row + 1; 
//                val2 = 1; 
//            } 
//            else { 
//                nst = nst - 1; 
//                nsp1 = nsp1 + 2; 
//                nsp2 = nsp2 - 2; 
//                val1 = n - row; 
//                val2 = 1; 
//            } 
//            row = row + 1; 
//        } 
//    } 
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        drawPattern(N);
//
//
//    }
//}
//
//
//////character array
//import java.util.*;
//public class Main {
//    public static void main (String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int row = 1;
//        int nst = 1;
//        
//        while(row <= n){
//            char ch = 'a';
//            char ch1 = 'b';
//            for(int cst = 1; cst<= nst ; cst++){
//                if(row % 2 == 0){
//                    System.out.print(ch1+" ");
//                    ch1 += 2;
//                }
//                else if(row % 2 != 0){
//                    System.out.print(ch+" ");
//                    ch += 2;
//                }
//
//            }
//            System.out.println();
//            row++;
//            nst++;
//        }
//
//    }
//}
//
//
//
/////is armstrong
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        
//        if(n>0 && n < 1000000000){
//            int temp = n;
//            int temp2 = n;
//            int nod = 0;
//            int number = 0;
//            while(temp != 0){
//                temp = temp /10;
//                nod++;
//            }
//            while(n!= 0){
//            int rem = n % 10;
//            n = n / 10;
//            number +=(int) Math.pow(rem,nod);
//        }
//        if( number == temp2)
//        System.out.println("true");
//        else
//        System.out.println("false");
//        }
//        
//
//    }
//}
//
//
//
//////quadratic
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int d = b*b - 4*a*c;
//        int root1 =(int) (-b + Math.sqrt(d))/2;
//        int root2 = (int) (-b - Math.sqrt(d))/2;
//        if((a>= -100 && a<= 100) && (b>= -100 && b<= 100) && (c>= -100 && c<= 100)){
//        if(d > 0){
//            System.out.println("Real and Distinct");
//            if(root1>root2)
//            System.out.println(root2 + " "+ root1);
//            else
//            System.out.println(root1 + " "+ root2);
//        }
//        else if(d == 0){
//            System.out.println("Real and Equal");
//            System.out.println(root1 + " "+ root2);
//        }
//        else{
//            System.out.println("Imaginary");
//        }
//        }
//    }
//}
//
//
//
/////downward triangle
//import java.util.*;
//public class Main {
//    public static void main (String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int row = 1;
//        int nst = n;
//        int nsp = 0;
//        while(row<=n){
//            for(int csp = 0; csp < nsp; csp++)
//            System.out.print(" ");
//            for(int cst = 1; cst<= nst; cst++)
//            System.out.print("* ");
//            System.out.println();
//        row++;
//        nst--;
//        nsp++;
//        }
//        
//    }
//}
//
//
////square pyramid
//import java.util.*;
//public class Main {
//    public static void main (String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int row = 1;
//        int nst = 1;
//        while(row<=n){
//            for(int cst =1 ;cst <= nst; cst++){
//                System.out.print(cst*cst +" ");
//            }
//            System.out.println();
//            row++;
//            nst++;
//        }
//    }
//}
//
//
//
/////manmohan loves pattern 1
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int row = 1;
//        int nst = 1;
//        int val = 1;
//        while(row<=n){
//            for(int cst= 1; cst<=nst;cst++){
//               if( row % 2 == 0){
//                   if(cst == 1 || cst == nst)
//                   System.out.print(val);
//                   else
//                   System.out.print("0");
//               }
//               else
//               System.out.print(val);
//            }
//            System.out.println();
//            row++;
//            nst++;
//        }
//
//    }
//}
//
//
//
