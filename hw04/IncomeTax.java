//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw04
//Income Tax

//Prompts the user to enter an int that gives thousands of dollars of income 
//then writes out the amount of tax on the income.
//Given the schedule: 
//<20 , 5%
//>=20 & < 40 , 7%
//<78 , 12%
//>=78 , 14%

import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args)  {
                
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
//prompt user to enter an int giving the thousands of dollars
System.out.print("Enter an int giving the number of thousands- ");
//accept user input
//declaring variables 
double tax$=0;
double taxTotal$=0;
//checks if its an integar
//also validates it is a positive integar 
if(myScanner.hasNextInt()) {
    int nIntValue$=myScanner.nextInt();
    
    if (nIntValue$>0) { //validates that the integar inputted by user is positive
    if (nIntValue$<20) {
        tax$=0.05; //tax amount for this value ($20,000 with a tax of 5%)
        taxTotal$=nIntValue$*tax$; //defining tax total for all values 
    }
    if (nIntValue$>=20 && nIntValue$<40) {
        tax$=0.07; //tax amount for this value (greater than $20,000 and less than $40,000 with a tax of 7%)
        taxTotal$=nIntValue$*tax$; //defining tax total
    }
    if (nIntValue$<78) {
        tax$=0.12; //tax amount for this value (less than $78,0000 with a tax of 12%)
        taxTotal$=nIntValue$*tax$; //defining tax total
    }
    if (nIntValue$>=78) {
        tax$=0.14; //tax amount for this value (greater than $78,0000 with a tax of 14%)
        taxTotal$=nIntValue$*tax$; //defining tax total
    }
    //now we must conver the integar value inputed by user into thousands 
    nIntValue$=nIntValue$*10000;
    
    System.out.println("The tax rate on " + nIntValue$ + "is " + (tax$*100) + "and the tax is " +(taxTotal$*1000));
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
        
    }
}