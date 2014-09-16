//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw03
//Four Digits

//Meant to prompt user to enter a double.
//Prints out the first four digits to the right of the decimal point.

import java.util.Scanner;

public class FourDigits{
    public static void main(String[] args)  {
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
    
    //prompt user to enter a double 
    System.out.print("Enter a double and I will display the four digits to the right of the decimal point: ");
    //accept user input
    double ndoubleNumber = myScanner.nextDouble();
    
    double tempNumber= ndoubleNumber*10000;
    //declaring int variables
    int digit4,digit3,digit2,digit1;
    digit4= (int) tempNumber % 10;
    tempNumber/=10;
    digit3=(int) tempNumber % 10;
    tempNumber/=10;
    digit2= (int) tempNumber % 10;
    tempNumber/=10;
    digit1=(int) tempNumber % 10;
    
    //printing four digits to thr right of decimal point
    System.out.println("The four digits are " + digit1+digit2+digit3+digit4);
    
    }
}