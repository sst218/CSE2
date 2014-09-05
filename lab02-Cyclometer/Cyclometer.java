//Stutti Tilwa 
//CSE 2
//Section 111
//September 5, 2014
//lab02
//Cyclometer 

//Meant to record two kinds of data.
//Records time in seconds and number of rotations of the front wheel.
//Program will print the number of minutes for each trip,
//print the number of counts for each trip,
//print the distance of each trip in miles,
//print the distance for the two trips combined. 
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[] args)  {

//our input data
    int secsTrip1=480; //seconds of time elapsed in first trip
    int secsTrip2=3220; //seonds of time elapsed in second trip
    int countsTrip1=1561; //number of counts for first trip
    int countsTrip2=9037; //number of counts for second trip

// our intermediate variables and output data
    double wheelDiameter=27.0, //introducing initial variables 
    PI=3.14159, //value of PI
    feetPerMile=5280, //the amount of feet in a mile 
    inchesPerFoot=12, //the amount of inches in a foot
    secondsPerMinute=60; //the amount of seconds in a minute
    double distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile, distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile, totalDistance=distanceTrip1+distanceTrip2; //more initial variables 
    
    System.out.println("Trip 1 took "+ 
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute) +" minutes and had "+
            countsTrip2+" counts.");
    
//run the calculations; store the values. 
//calculating values for the distances
distanceTrip1=countsTrip1*wheelDiameter*PI;
//above calculation gives the distance in inches
//(for each count, rotation of the wheel travels the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; //this gives the distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 

//print out the output data
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");

    }   
}   