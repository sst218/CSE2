//Stutti Tilwa
//CSE 2
//Section 111
//November 4, 2014
//hw09
//Blocked Again

//Must add methods to the BlockedAgain class
//add the method getInt(), which, when called in the main method, 
//will request input from the user and solve [problem A] 
//by calling methods checkInt() and checkRange().  
//getInt() continues to request input from the user until acceptable input is provided.  
//Next, add the method checkint(), which, when called by getInt(), 
//will accept inputs of your choice and test whether the user’s input is an integer 
//Finally, implement the method checkRange(), which, when called by getInt(),
//will accept inputs of your choice and test whether the user’s input is within range 1-9 inclusive,

import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}//end of main method

// Problem A
		public static int getInt() {
		Scanner myScanner=new Scanner(System.in); //scanner constructor 
		int userInput;//initializing variables 
		System.out.print("Enter an int between 1 and 9, inclusive: "); //prompts user to enter an integer between 1 and 9
		while(true) {
	        if (!checkInt(myScanner)) { //must make sure user input is an int
	        	myScanner.next();
	        	System.out.print("You did not enter an int; try again: ");
	        }
	        userInput=myScanner.nextInt(); //using input for scanner as an int
	        if(!checkRange(userInput)) { //make sure user input is within the bounds 1 and 9
	        	System.out.print("You did not enter an int in [1,9]; try again: ");//if not within bounds
	        }
	      return userInput; 
		}
	}//end of getInt
	
	// Problem A1
	public static boolean checkInt(Scanner myScanner) {
		if (myScanner.hasNextInt()) { //checking int
			return true;
		}
		else{
        return false;    
		}
	}//end of checkInt
	
	// Problem A2
	public static boolean checkRange(int userInput) {
		if(userInput > 0 && userInput < 10) { //making sure input is within the range of 1-9
			return true; //if user input is within bounds
		}
		else{
		return false; //if user input is outside the given bounds
		}
	}//end of checkRange
	
	//Problem B
	public static void allBlocks(int m) {
		for (int j=1;j<=m;j++) { //outter for loop
			block(m,j); //calling block method
			line(m,j);//calling line method 
		}
	}//end of allBlocks
	
	// Problem B1
	public static void block(int m, int j) {
		for(int y=1;y<=j;y++) { 
			for (int k=1;k<=(m - j)+1;k++){ //nested loop prints out the spaces to format number stacks
				System.out.print(" "); //printing spaces 
			}//end of nested loop
			for (int i=1;i<=(j*2)-1;i++){ 
				System.out.print(j); //printing the number stacks based on j
			}
			System.out.println();
		}
	}//end of block
	
	// Problem B2
	public static void line(int m, int j) {
		for (int k=1;k<=(m - j)+1;k++){ //formating the spacing 
			System.out.print(" "); //need to print spaces
		}
		for (int x=1;x<=(j*2)-1;x++){
			System.out.print("-"); //printing the dashes between the number stacks
		}
		System.out.println();
	}//end of line

}//end of class 
