//Stutti Tilwa
//CSE2
//Extra Credit Assignment 

import java.util.Scanner;
public class ExtraCredit{
  public static void main(String [] arg){
    System.out.print("Enter an int:");
	int k=(new Scanner(System.in)).nextInt();
	
System.out.println("Version Given:");
        for(int i=2; i<k; i++) {
	    System.out.println("i: "+i);
	}

	
System.out.println("Version using while loop");
int i=2;
while (i<k) {
  System.out.println("i: "+i);  
  i++;  
}

	
System.out.println("Version using do-while loop");
i=2;
do {
 System.out.println("i: "+i);  
  i++;     
} while (i<k);
	
  }//end of main method
}//end of class