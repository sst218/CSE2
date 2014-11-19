//Stutti Tilwa
//CSE 2
//Section 111
//November 8, 2014
//lab11

//Create an array that can hold 10 ints
//Ask the user enter 10 ints and store them in the array
//Search the array for the highest entry and print it out
//Search the array for the lowest entry and print it out
//Sum the ints in the array and print out the sum
//Copy the contents of the array into a second array in reverse order 
//Print the contents of the two arrays in two columns, side by side. 

import java.util.Scanner;
public class Arrays{
	public static void main(String[] args) {
		int[] myArray = new int[10];
		Scanner myScanner = new Scanner(System.in); //scanner constructor 
		int minHolder, maxHolder, sumHolder;
		
		// ask user to enter 10 int values and store them in an array
		System.out.print("Enter 10 int numbers - ");

		for(int i = 0; i < 10; i++) {
			myArray[i] = myScanner.nextInt();
		}
		
		// find the highest, lowest entry from the array; also, sum the array values
		minHolder=myArray[0];
		maxHolder=myArray[0];
		sumHolder=myArray[0];
		for(int i=1; i<myArray.length; i++) {
			if(myArray[i]<minHolder) {
				minHolder=myArray[i];
			}
			if(myArray[i]>maxHolder) {
				maxHolder=myArray[i];
			}
			sumHolder+=myArray[i];
		}
		System.out.println("The lowest entry is " + minHolder);
		System.out.println("The highest entry is " + maxHolder);
		System.out.println("The sum is " + sumHolder);
		
		// copy the contents of the array into a second array in reverse order
		int[] reverseArray=new int[10];
		for(int i=(myArray.length - 1), j=0; i>=0; i--, j++) {
			reverseArray[j]=myArray[i];
			System.out.println("\t" + myArray[j] + "\t" + reverseArray[j]); // print the contents of the two arrays in two columns side by side
		}
		
		/* another way to print values from both arrays; comment out the print statement from the previous for loop
		// print the contents of the two arrays in two columns side by side
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("\t" + myArray[i] + "\t" + reverseArray[i]);
		}
		*/
	}

}