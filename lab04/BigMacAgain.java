//Stutti Tilwa 
//CSE 2
//Section 111
//September 19, 2014
//lab04
//Big Mac Again

//Meant to obtain how many Big Macs users want 
//and whether they want an order of fries.
//Prints out total cost of the meal 

import java.util.Scanner;

public class BigMacAgain{
    public static void main(String[] args)  {
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
     
    //prompt user to enter number of Big Macs
    System.out.print("Enter a the number of Big Macs: ");
    //accept user input
    int nBigMacNumber;
    //boolean statement
    double totalBigMacCost=0; //input value
    double costBigMac$=2.22; //input cost of Big Mac 
    //checks if its an integar
    //also validates it is a positive integar 
    if(myScanner.hasNextInt()) {
        nBigMacNumber=myScanner.nextInt(); //is it an integar?
        if (nBigMacNumber > 0) {  //is it a positive integar?
            totalBigMacCost=(int)((nBigMacNumber*costBigMac$*100)/100.0); 
            System.out.println("You ordered " + nBigMacNumber + "Big Macs for a cost of " + (nBigMacNumber*costBigMac$) + "equals" +totalBigMacCost);
            //math to calculate bigMac
        } 
        else
        { 
        System.out.println("You did not enter an int > 0");
        return;     //leaves the program 
                    //program terminates 
        }
         } 
    else{
        System.out.println("You did not enter an int");
        return;  //leaves the program
                //the program terminates
        }
        System.out.println("Do you want an order of fries (Y/y/N/n)? ");
    String answer=myScanner.next();
    if(answer.equals("N") || answer.equals("n") )
    {
        System.out.println("The total cost of the meal is " + totalBigMacCost );
    }
    else if (answer.equals("Y") || answer.equals("y")) {
            
    {
       double costFries$=2.15; //input values for fries
       System.out.println("The total cost of the meal is " + ((nBigMacNumber*costBigMac$) + costFries$));
    }
        }
    else{
        System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
        return; //leaves the program
                //program terminates
        }
        
        }
    }
