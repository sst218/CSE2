//Stutti Tilwa
//CSE 2
//Section 111
//October 14, 2014
//hw06
//Root

//The bisection method is a very simple way to compute the square root of a number 
//Sets low to 0 and high to 1+x
//Below is a program that forces the user to enter a double that is greater than 0, 
//then uses an algorithm to compute the square root of the number, and then prints it out. 

import java.util.Scanner;
public class Root{
    public static void main (String[] args){
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //scanner constructor 
System.out.print("Enter a double that is greater than 0: "); //forces the user to enter a double that is greater than 0
//initialized variables 
double userNumber=myScanner.nextDouble(); //storing scanner input 
double low=0;
double high=1+userNumber; //high value is 1+x where x is the user input 
double middle=0;

while ((high-low) >  0.0000001*(1+userNumber)) {//must make the difference between high and low is less than some small multiple
//Then the square root is very close to both low and high
middle=((low+high)/2); //takes values and gets closer and closer to actual square root 
    if ((middle*middle)>userNumber) { 
       high=middle; //ff the square of middle is greater than x, must change high to middle
        }//end of if statement
        else {
            low=middle; 
            } //end of else statement
} //end of while loop
System.out.println("This is the square root: " + middle);
    }//end of main method
}//end of class 