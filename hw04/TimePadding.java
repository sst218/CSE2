//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw04
//Time Padding

//Prompts user to enter a positive int 
//giving the number of seconds that have passed during the day
//then displays the time in conventional form. 
//(display time with "padding" eg. 10:03:05)

import java.util.Scanner;

public class TimePadding{
    public static void main(String[] args)  {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor

//prompt user to enter an int giving the thousands of dollars
System.out.print("Enter the time in seconds: ");
//accept user input
int nTimeInSeconds=myScanner.nextInt();
//declaring all variables as int so there isnt a decimal when printing at later time
int hours=0;
int minutes=0;
int seconds=0;
int newTimeInSeconds=0;
//calculations for getting values for hours, minutes and seconds
hours= nTimeInSeconds/3600;
minutes= (nTimeInSeconds-(hours*3600))/60;
seconds= (nTimeInSeconds-(hours*3600))-(minutes*60);
//conditional statement if value inputted by user is larger than 12 hours
//there are 43200 seconds in 12 hours
if (nTimeInSeconds>43200) {
    newTimeInSeconds=nTimeInSeconds-43200;
}
//printing out the time using time padding
System.out.println("The time is " + "0"+hours+":0"+minutes+":0"+seconds+".");

    }
}
    
