//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw04
//Month

//Prompts user to enter an int for the month
//(1 for January, 2 for February, etc.)
//then displays the number of days in that month and asks user to enter the year.

import java.util.Scanner;

public class Month{
    public static void main(String[] args)  {
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor

//prompt user to enter an int giving the thousands of dollars
System.out.print("Enter an int giving the number of the month (1-12)- ");
//checks if its an integar
//also validates it is a positive integar 
if(myScanner.hasNextInt()) {
    int nMonth=myScanner.nextInt(); //accept user input
    if(nMonth<12 && nMonth>0) {
    if (nMonth==1 || nMonth==3 || nMonth==5 || nMonth==7 || nMonth==8 || nMonth==10 ||nMonth==12) {
        System.out.println("This month has 31 days.");
    }
    else if (nMonth==4 || nMonth==6 || nMonth==9 || nMonth==11) {
        System.out.println("This month has 30 days.");
    }
    else if (nMonth==2) {
        System.out.print("Enter an int giving the year: ");
        int nYear=myScanner.nextInt(); //accept user inputs
            if(nYear%4 == 0) {
             System.out.println("This month has 29 days.");
            }
        else 
        {
            System.out.println("This month has 28 days. ");
        }
    }
        }  
    }
    else{
        System.out.println("You did not enter an int between 1 and 12.");
        return; //leaves the program
                //program terminates
        }
    }
}

