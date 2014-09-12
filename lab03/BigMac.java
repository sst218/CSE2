//Stutti Tilwa
//CSE 2
//Section 111
//September 12, 2014
//lab03
//Big Mac
//Computes the cost of buying Big Macs
//Uses Scanner class
//Obtains how many Big Macs, cost per Big Mac, and percentage tax

import java.util.Scanner;

public class BigMac {
    public static void main (String [] args)    {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
    //prompt user for number of tickets 
    System.out.print("Enter the number of Big Macs (an integer greater than 0): ");
    //accept user input
    int nBigMacs = myScanner.nextInt();
    //prompting user for the cost of the Big Mac and the percent sales tax
    System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx): ");
    double bigMac$ = myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //this is where the user enters the percent but we want proportion
    
    double cost$;
    int dollars, // the whole dollar amount of the cost
        dimes, pennies; //ability to store digits
            //to the right of the decimal point
            //for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount 
    // % (mod) opertator returns the remainder
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) +"%, is $" +dollars+'.'+dimes+pennies);

    
    
    }
}