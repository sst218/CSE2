//Stutti Tilwa
//CSE 2
//Section 111
//September 16, 2014
//hw04
//Course Number

//A semester during which a course at Lehigh is offered is given by a 6 digit number.
//First 4 digits give the year,
//and the last 2 digits give the semester:
//10 spring
//20 summer 1
//30 summer 2
//40 fall
//Program should read the 6 digit number(adhering to above description)
//then prints out the semester and year

import java.util.Scanner;

public class CourseNumber{
    public static void main(String[] args)  {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
    
//define basic variables
int year;
int number1;
int number2;
int semester;
String course = ""; 
    
//prompt user to enter an int giving the thousands of dollars
System.out.print("Enter a six digit number giving the course semester- ");
int nCourseSemester=myScanner.nextInt(); //accept user input
if (nCourseSemester>186510 && nCourseSemester<201440) { //must confirm what is being entered is a legitamate semester
    number1=nCourseSemester/100; 
    year= (int)number1; //converting value into an int 
    number2=year*100; 
    semester=nCourseSemester-number2; //defines the semester as the last 2 remaining digits
    if (semester==10) { //input given facts
        course="Spring";
    }
    if (semester==20) { //input given facts
        course="Summer 1";
    }
    if (semester==30) { //input given facts
        course="Summer 2";
    }
    if (semester==40) { //input given facts
        course="Fall";
    }
    if (semester==10||semester==20||semester==30||semester==40) {
      System.out.println("The course was offered in the " +course+ "semester of " +year);  
    }
        
        else {
        System.out.println("The number entered is not a legitimate semester");
        return; //leaves the program
                //program terminates
            }
        }
        else 
        {
                System.out.println("The number was outside the range [186510,201440]");
                return; //leaves the program
                //program terminates
        }

    }
}
   