//Stutti Tilwa
//CSE 2
//Section 111
//September 30, 2014
//hw04
//Burger King

//Prompts user the user to enter a choice of a burger, a soda, or fries.
//Then the program prompts the users for details of their choices.

import java.util.Scanner;

public class BurgerKing{
    public static void main(String[] args) {

Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor

//prompts the user to enter a choice of a burger, a soda, or fries
System.out.println("Enter a letter to indicate a choice of ");
System.out.println("Burger (B or b)");
System.out.println("Soda (S or s)");
System.out.print("Fries (F or f) ");
//accepts user input
String input1=myScanner.next();

switch (input1)
{
    case("B"):
    case("b"):
    System.out.println("Enter A or a for 'all the fixins'");
    System.out.println("C or c for cheese)");
    System.out.print("N or n for none of the above ");
    break;
        String input2=myScanner.next();
        switch (input2) 
        {
        case("C"):
        case("c"):
        System.out.println("You ordered a burger with cheese")
        break;
        case("N"):
        case("n"):
        System.out.println("You ordered just a burger with none of the above")
        break;
        case("A"):
        case("a"):
        System.out.println("You ordered a burger with 'all the fixins'")
        break;
        }
    case("S"):
    case("s"):
    break;
        
    case("F"):
    case("f"):
    break;    
} //end of first swtich 
        
        
        
        
    } //end of main method
} //end of class