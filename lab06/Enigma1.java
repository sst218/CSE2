//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab06
//Enigma 1

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   x=(x)/100; //making it as a percentage 
   double y= 1-x;
        System.out.println("The proportion remaining is "+ y);
   
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 x needs to be written as an actual percent which is done by dividing by 100
 the variable y is created to make the proportion remaining be able to be printed more efficiently
 *    
 Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * 
 * 
 * 
 */
