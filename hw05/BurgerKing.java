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
//using switch for when user gets a burger, soda, fries
//asks further questions about burger choice, soda choice or fries choice
switch (input1)
{
    case("B"):
    case("b"):
    System.out.println("Enter A or a for 'all the fixins'");
    System.out.println("C or c for cheese)");
    System.out.print("N or n for none of the above ");
        String input2=myScanner.next(); //further questions about burgers
        switch (input2) 
        {
        case("C"):
        case("c"):
        System.out.println("You ordered a burger with cheese");
        break;
        case("N"):
        case("n"):
        System.out.println("You ordered just a burger");
        break;
        case("A"):
        case("a"):
        System.out.println("You ordered a burger with 'all the fixins'");
        break;
        }
        break;
    case("S"):
    case("s"):
    System.out.println("Do you want Pepsi (p or P),");
    System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
        String input3=myScanner.next(); //further questions about soda
        switch (input3) 
        {
        case("P"):
        case("p"):
        System.out.println("You ordered a Pepsi");
        break;
        case("C"):
        case("c"):
        System.out.println("You ordered a Coke");
        break;
        case("M"):
        case("m"):
        System.out.println("You ordered a Mountain Dew");
        break;
        }
        break;
    case("F"):
    case("f"):
    System.out.print("Do you want a large or small order of fries (l,L,s, or S");
        String input4=myScanner.next(); //further questions about fries
        switch (input4)
        {
        case("L"):
        case("l"):
        System.out.println("You ordered large fries");
        break; 
        case("S"):
        case("s"):
        System.out.println("You ordered small fries");
        break;
        }
        break;   
        default:
        System.out.println("You did not enter any of B, b, S, s, F, or f"); //makes sure user enters character needed
        
        
} //end of first swtich 
        
        
        
        
    } //end of main method
} //end of class