//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab07
//Loop the Loop

import java.util.Scanner;


public class LoopTheLoop{
    public static void main(String[] args){
        
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor
//prompts user to enter an int between 1 and 15
System.out.print("Enter an int between 1 and 15- ");
 
        
      int nStars=10; 
      int j=1;
      while (j<=nStars) {
      System.out.print("*");
      j++;
      }
         int outerCounter=1;
         int innerCounter=1;
         while (outerCounter<=nStars){
             System.out.println();
             innerCounter=1;
             while (innerCounter<=outerCounter){
                 System.out.print("*");
                 innerCounter++;
             }
             outerCounter++;
         }

    }//end of main method
}//end of class 