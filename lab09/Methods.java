//Stutti Tilwa
//CSE 2
//Section 111
//October 24, 2014
//lab09
//Methods

//Java class whose main program calls three different methods.
//Must write methods for these three different methods. 

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  } //end of main method 
  
 public static int getInt(Scanner myScanner) {
		System.out.print("Enter an int- "); //forces user to enter ints
		while(!myScanner.hasNextInt()) { //if
			myScanner.next(); // gets rid of values that are not ints 
			System.out.print("You did not enter an int; try again- "); //if no int is entered 
		}
		int x = myScanner.nextInt(); //declaring variable 
		return x;
	}//end of getInt method
  
 public static int larger(int number1, int number2) {
		if(number1 > number2) { //tries to see which number is larger 
			return number1; //returns number 1 if it is larger
		}
		return number2;
	} //end of larger method 
	
 public static boolean ascending(int number1, int number2, int number3) {
			if(number1 < number2) { 
				if(number2 < number3) {
					return true;
				}
			}
			return false;
		} //end of ascending method 
 
}//end of class