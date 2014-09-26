//Stutti Tilwa
//CSE 2
//Section 111
//September 26, 2014
//lab04
//Random Games

//Prompts user to choose one of the following three choices for a game of chance
//(1) Roulette, (2) Craps, (3) Picking a card from a deck of playing cards
//User should enter one of the Strings "R", "r", "C","c", "P", "p"
//If the string is not of lenth 1, an error message should be displayed
//If the string has any other character than "R", "r", "C","c", "P", "p", an error message should be displayed
//If the user enters "R" or "r" , then the program will print results of a play at Roulette
//If the user enters "C" or "c" , then the program should display the random outcome of two rolls of a die
//If the user enters "P" or "p" , then the program should display a random draw from a deck of cards 


import java.util.Scanner;

public class RandomGames{
    public static void main(String[] args) {
Scanner myScanner;
    myScanner = new Scanner (System.in); //Scanner constructor

//prompt user to choose one of the three choices of games
System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for pick a card- ");
//accepts user input
String answer=myScanner.next();

switch (answer)
{
   case("R"):
   case("r"):
       int rouletteWheel= (int) (Math.random()*38+1);
       switch (rouletteWheel)
       {
           case 38: 
               System.out.println("Roulette: 00");
               break;
               
               default:
               System.out.println("Roulette: " + rouletteWheel);
               break;
       }
       break;
    case("C"):
    case("c"):
       /* int dice1;
        int dice2;
        dice1=(int)(Math.random()*6+1);
        dice2=(int)(Math.random()*6+1);
        System.out.println("Craps: " + dice1 + "+" + dice2 + "=" +(dice1+dice2));*/
        
        System.out.println("this game has not yet been implemented - try in the future!");
        break;
    case("P"):
    case("p"):
        /*int suit=(int)(Math.random()*4+1);
        int card=(int)(Math.random()*13+1);
            switch (suit)
            {
                case 1:
                    switch (card) 
                    {
                     case 1: 
                         System.out.println("Ace of Spades");
                         break;
                    case 11:
                        System.out.println("Jack of Spades");
                        break;
                    case 12:
                        System.out.println("Queen of Spades");
                        break;
                    case 13:
                        System.out.println("King of Spades");
                        break;
                    default:
                        System.out.println(card + " of Spades");
                        break;
                    }
                case 2:
                    switch (card)
                    {
                    case 1: 
                         System.out.println("Ace of Hearts");
                         break;
                    case 11:
                        System.out.println("Jack of Hearts");
                        break;
                    case 12:
                        System.out.println("Queen of Hearts");
                        break;
                    case 13:
                        System.out.println("King of Hearts");
                        break;
                    default:
                        System.out.println(card + " of Hearts");
                        break; 
                    }
                    switch (card)
                    {
                    case 1: 
                         System.out.println("Ace of Diamonds");
                         break;
                    case 11:
                        System.out.println("Jack of Diamonds");
                        break;
                    case 12:
                        System.out.println("Queen of Diamonds");
                        break;
                    case 13:
                        System.out.println("King of Diamonds");
                        break;
                    default:
                        System.out.println(card + " of Diamonds");
                        break;
                    }
                    switch (card)
                    {
                    case 1: 
                         System.out.println("Ace of Clubs");
                         break;
                    case 11:
                        System.out.println("Jack of Clubs");
                        break;
                    case 12:
                        System.out.println("Queen of Clubs");
                        break;
                    case 13:
                        System.out.println("King of Clubs");
                        break;
                    default:
                        System.out.println(card + " of Clubs");
                        break; 
                    }
                    break;
                        default:
                        break;
            }
            break;
            default:
            System.out.println("'" + answer + " is not one of 'R', 'r', 'C','c','P','p'");
            break;
        */
        System.out.println("this game has not yet been implemented - try in the future!");
        break;
        
        default:
        System.out.println("a single character expected");
        break;
    }
    
}
    }
