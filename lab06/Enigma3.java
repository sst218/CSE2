//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab06
//Enigma 3

/* Insert System.out.println() statements in the code

 * below, displaying the status of n and k, which 

 * should help you identify when n or k becomes 0 and causes

 * the program to crash

 */
import java.util.Scanner;

public class Enigma3{
	 public static void main(String [] arg){
	
		 int n=40,k=60;
		
		 String out="";
		
		 switch(k%14){
		
			 case 12: 
			 case 13: out+=13;
			 break;
			 default: out+=40;
			 n/=3;
			 k-=7;
			 System.out.println("inside first switch - default:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
			
		 }
		
		 if(n*k%12< 12){
		
			 n-=20;
			 System.out.println("inside first if:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
		
			 out+=n;
		
		 }
		
		 if(n*n>k){
		
			 n=42;
			 out+=n+k;
			 System.out.println("inside second if:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
		
		 }
		
		 else {
		
			 n=45;
			 out+=n+k;
			 System.out.println("inside second else:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
		
		 }
		
		 switch(n+k){
		
			 case 114: 
			 n-=11;
			 k-=3;
			 System.out.println("inside second switch - case 114:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
			 break;
			 case 97:
			 n-=14;
			 k-=2;
			 System.out.println("inside second switch - case 97:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
			 break;
			 case 98:
			 n/=5;
			 k/=9;
			 System.out.println("inside second switch - case 98:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
			 default:
			 n-=3;
			 k-=5;
			 System.out.println("inside second switch - default:");
			 System.out.println("n = " + n);
			 System.out.println("k = " + k);
			
		 }
		
		 out+=1/n + 1/k;  // k here is 0--cannot have division by 0
		 System.out.println(out);
		
	 }

}

/*

 * Error report:

 * adding print statements in between to find out the values of n and k throughtout the program
 helped figure out where exactly the program was crashing

 *this gave me the line where there was division by zero (which was line 103 in the statement:out+=1/n + 1/k;) 
 because the value of k by the last swtich is 0

 * 

 * 

 */