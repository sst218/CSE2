//Stutti Tilwa
//CSE 2
//Section 111
//November 4, 2014
//hw10
//PokerOdds

//Program 2
//The method showOneHand() should generate random poker hands, 
//prompting the user if they would like another hand to be generated (it will repeat as long the user desires). 
//The method simulateOdds() should randomly generate 10000 hands 
//and count the number of times that a hand with a pair of a specific rank occurs, 
//along with the number of hands that do not have a pair.
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }//end of main method
  
//should generate random poker hands, 
//prompting the user if they would like another hand to be generated
public static void showHands(){
		Scanner scan=new Scanner(System.in);
		String userChoice="";
		int [] hand;
		do{
			hand=generateHand();
			displayHand(hand);
			System.out.print("Would you like to generate another hand? Enter 'y' or 'Y', anything else to quit ");
			userChoice=scan.next();
		}while(userChoice.equals("Y") || userChoice.equals("y"));
	}
	
	public static int [] generateHand(){
		int [] deck=new int[52];
		int [] hand=new int[5];
		int counter;
		int randomCard;
		for(int i=0; i<deck.length; i++) {
			deck[i]=i;
		}
		for(int i=0; i<hand.length; i++){
			hand[i]=-1; 
		}
		counter=0;
		for(int i =0; i<hand.length; i++){
			//“draw” the first card by generating a random number between 0 and 51 inclusive
			randomCard=(int) (Math.random() *(deck.length-counter));
			//use number as an index into the array and store that number in the first array of the hand. 
			//swap the value of the array position you randomly selected 
			//with the last member of the deck array 
			//swap allows you to select the next random card by generating a random number from 0 to 50 inclusive,
			//and swapping the selected card again, etc, until you have drawn 5 cards.
			hand[i]=deck[randomCard];
			deck[randomCard]=deck[(deck.length- 1)-counter];
			deck[(deck.length- 1)-counter] = -1;
			counter++;
		}
		return hand;
	}//end of generatehand
	
	public static void displayHand(int [] hand){
		//display using labels in an array of Strings and 
		//using the loop index to access the appropriate label. 
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] ranks = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		int suit;
		int rank;
		String out;
		for(int i=0; i<suits.length; i++){
			out =""; 
			out +=(suits[i] + ": ");
			for(int j=0; j<hand.length;j++){
				suit=hand[j]/13; // returns the suit 
				rank=hand[j]%13; //expression %13 generates the rank
				if(suits[i]==suits[suit]){
					out += " " + ranks[rank];
				}
			}
			System.out.println(out);
		}
		
	}
	//should randomly generate 10000 hands and 
 //count the number of times that a hand with a pair of a specific rank occurs 
 //along with the number of hands that do not have a pair
	public static void simulateOdds(){
		//initializing variables 
		int [] rankPairs=new int[13]; 
		int [] hand;
		int notJustOnePair=0;
		int rankDup;
		for(int i=0; i<10000; i++){ 
			hand=generateHand();
			hand=rankCards(hand);
			// check if the hand has exactly one pair and if it does, find out which card rank has pair and increase the counter for that rank pair
			if(exactlyOneDup(hand)){
				rankDup=getDups(hand);
				rankPairs[rankDup]+=1;	
			}
			else{
				notJustOnePair+=1; // counter for not exactly one pair hands
			}		
		}
		displayOdds(rankPairs, notJustOnePair);
	}//end of stimulateodds
	
	public static int [] rankCards(int [] hand){
		int rank;
		for(int i=0; i<hand.length;i++){
			rank=hand[i]%13;
			hand[i]=rank;
		}
		return hand;
	}//end of method rankcards
	
public static boolean exactlyOneDup(int [] array){
int counter=0;
for(int i=0; i<array.length;i++){
  for(int j=(i+ 1);j<array.length;j++){ 
    if(array[i]==array[j]){
    counter+=1; 
        }
    }  //if counter is more than one than the array has more than one duplicate and it will return false 
}
  if(counter==1){ 
    return true;
    }
  return false;
  }//end of method exactlyonedup
	
	public static int getDups(int [] array){
		int holder;
		for(int i=0; i<array.length; i++){
			holder=array[i];
			for(int j=(i + 1); j<array.length; j++){
				if(holder==array[j]){
					return holder;
				}
			}
		}
		return (-1);
	}//end of getdups 
	

	public static void displayOdds(int [] rankPairs, int notJustOnePair){
		String [] ranks= {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		String out= "";
		String tab= "\t";
		String newLine= "\n";
		String space= " ";
		out+=(space + "Rank" + tab + "Freq of Exactly One Pair" + newLine);
		for(int i=0; i<ranks.length;i++){
			out+=(space + space + ranks[i] + tab + space + rankPairs[i] + newLine);		
		}
		out+=("--------------------------" + newLine);
		out+=("Total Not Exactly One Pair: " + notJustOnePair);
		System.out.println(out);
	}//end display odds
	

  
 
}//end of class
