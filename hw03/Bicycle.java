//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw03
//Bicycle

//Meant to prompt user to enter number of counts on a cyclometer
//and the number of seconds in which the counts occurred.
//Will print out the distance traveled and the average miles per hour.

import java.util.Scanner;

public class Bicycle{
    public static void main(String[] args)  {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
        
    //prompt user for number of counts on a cyclometer
    System.out.print("Enter the number of counts on a cyclometer: ");
    //accept user input
    double nCounts = myScanner.nextDouble();
    //prompting user for the number of seconds during which the counts occured
    System.out.print("Enter the number of seconds in which the counts occured: ");
    double nSeconds = myScanner.nextDouble();
   
   //input data
    double wheelDiameter=27.0, //delcaring diamtete of wheel
    PI=3.14159, //value of PI
    feetPerMile=5280, //the amount of feet in a mile 
    inchesPerFoot=12, //the amount of inches in a foot
    secondsPerMinute=60; //the amount of seconds in a minute
    double distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculating distance and time for trip
    double mph=distanceTrip/((nSeconds/secondsPerMinute)/60);
    
    int round= (int)(distanceTrip*100);
    distanceTrip=round/100.0;
    round=(int)(mph*100);
    mph=round/100.0;
    round= (int)(nSeconds*100);
    nSeconds=round/100.0;
    
    System.out.println("The distance was "+ distanceTrip + " miles and took " + (nSeconds/secondsPerMinute) + " minutes.");
    System.out.println("The average mph was " +mph);
    
    }
}