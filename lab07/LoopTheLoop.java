//Stutti Tilwa
//CSE 2
//Section 111
//October 10, 2014
//lab07
//Loop the Loop

import java.util.Scanner;

public class LoopTheLoop {
	public static void main(String[] args) {
		
Scanner myScanner;
    myScanner = new Scanner (System.in);
		
		while (true) {
			int nStars = -1;// initialize nStars to some value outside the range [1,15]
			while (nStars < 1 || nStars > 15) {
				System.out.print("Enter an int between 1 and 15- ");
				//forces the user to enter an int between 1 and 15,
				while (!myScanner.hasNextInt()) {
					myScanner.next();
					System.out.print("Enter an int between 1 and 15- ");
				}
				//control outside loop by testing whether nStars is outside the range [1,15]
				nStars = myScanner.nextInt();
				if (nStars >= 1 && nStars <= 15) {
					break;
				}
				System.out.println("Your int was not in the range [1-15]");
			}
			
			int counter = 1;
			while (counter <= nStars) {
				System.out.print("*");
				counter++;
			}
			int outerCounter = 1, innerCounter = 1;
			while (outerCounter <= nStars) {
				System.out.println();
				innerCounter = 1;
				while (innerCounter <= outerCounter) {
					System.out.print("*");//prints out the stars 
					innerCounter++;
				}
				outerCounter++;
			}
			
			System.out.print();
			
			System.out.print("Enter y or Y to go again- ");
			String userChoice = myScanner.next();
			
			if(!userChoice.equalsIgnoreCase("y")){
				break;
			}
		}
		
	}
}
