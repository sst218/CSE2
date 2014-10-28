//Stutti Tilwa
//CSE 2
//Section 111
//October 28, 2014
//lab08
//HW8

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");    
  } //endof main method

	public static char getInput(Scanner scan1, String firstInput){ 
String userInput;
while (true) {
	if (scan1.hasNext()) {
		userInput=scan1.next();
		if (userInput.length()==1) {
			if (userInput.charAt(0)==firstInput.charAt(0) || userInput.charAt(0)==firstInput.charAt(1)) { //check to see if scanner value and first input are the same 
				return userInput.charAt(0);
				} 
		else {
			userInput=scan1.next();
			System.out.print("You did not enter a character from the list 'Cc'; try again-");
			}
			}
			else {
			userInput=scan1.next();
			System.out.print("You should enter exactly one character-");
			}
	} //end of outer if statement 
} //end of outer while loop
	} //end of 1st method 
	
 
	public static char getInput(Scanner scan2, String secondInput, int number2) {
int counter=0;
char a=0;
String userInput2;
userInput2=scan2.next();
while (counter<=number2){
		if (userInput2.charAt(0)==secondInput.charAt(0) || userInput2.charAt(0)==secondInput.charAt(1) || userInput2.charAt(0)==secondInput.charAt(2) || userInput2.charAt(0)==secondInput.charAt(3)) {
		return userInput2.charAt(0);	
		}//end of second if 
	else {
	System.out.print("You did not enter a character from the list 'yYnN'; try again-");
		userInput2=scan2.next();
	}
counter++;
} //end of outer while loop
System.out.println("You failed after 5 tries");
return a; 
	} //end of 2nd method char
	
	
	public static char getInput(Scanner scan3, String thirdInput, String fourthInput) {
char b=0;
System.out.println(thirdInput);
System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
String userInput3;
userInput3=scan3.next();
if (userInput3.length()==1) {
	if (userInput3.charAt(0)==fourthInput.charAt(0) || userInput3.charAt(0)==fourthInput.charAt(1) || userInput3.charAt(0)==fourthInput.charAt(2) || userInput3.charAt(0)==fourthInput.charAt(3) ||userInput3.charAt(0)==fourthInput.charAt(4) || userInput3.charAt(0)==fourthInput.charAt(5) ||userInput3.charAt(0)==fourthInput.charAt(6) || userInput3.charAt(0)==fourthInput.charAt(7) || userInput3.charAt(0)==fourthInput.charAt(8) || userInput3.charAt(0)==fourthInput.charAt(9)) {
		return userInput3.charAt(0);		
	}//end of inner if 
	else {
	System.out.println("You did not enter an acceptable character");
	}
}//end of outer if
else {
	System.out.println("Enter exactly one character!");
	}
return b;
	}//end of 3rd method  
	
	
	
  
  
} //end of class 
