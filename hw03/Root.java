//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw03
//Root 

//Meant to prompt user to enter a double.
//Prints out a crude estimate of the cube root of the number 
//and the value of this crude guess when cubed. 

import java.util.Scanner;

public class Root{
    public static void main(String[] args)  {
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
    
    //prompt user to enter a double 
    System.out.print("Enter a double and I will print its cube root: ");
    //accept user input
    double ndoubleValue = myScanner.nextDouble();
    //starting to guess cube root and improving guess with each guess
    double Guess= ndoubleValue/3; 
    double Guess2=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
    double Guess3=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
    double Guess4=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
    double Guess5=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
    double Guess6=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
    double Guess7=(2*Guess*Guess*Guess+ndoubleValue)/(3*Guess*Guess);
   
    //rounding values of guesses
    double cubeRoot= ((Guess+Guess2+Guess3+Guess4+Guess5+Guess6+Guess7)/7);
    
    System.out.println("The cube root is" + cubeRoot+" and this value cubed is: "+(cubeRoot*cubeRoot*cubeRoot));
    
    }
}