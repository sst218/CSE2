//Stutti Tilwa
//CSE 2
//Section 111
//December 5, 2014
//hw11
//Poker Hands

//Prompts the user to enter a five card poker hand, 
//prints out the hand, and then prints out the rank of the hand,
//e.g. “Straight.” 

import java.util.Scanner;
public class PokerHands{
  public static void main(String [] arg){
   Scanner scan=new Scanner(System.in);
   String userChoice="y";
   int[] rankCounter;
   int[] rankPattern;
   String pattern;
   
   //ask user if they want to enter a set of cards 
   while(userChoice.equals("Y") || userChoice.equals("y")) {
   	System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
   	userChoice=scan.next();
   	
   	if (!(userChoice.equals("Y") || userChoice.equals("y"))) {
   		break;
   	}
   	rankCounter=generateHand(scan); 
   	rankPattern=generatePattern(rankCounter);
   	pattern=matchPattern(rankPattern);
   	
   	System.out.println("This is a "+pattern);
  
   }//end of while
   scan.close();
  }//end of main method
 
 //generate hand 
public static int[] generateHand(Scanner scan){
	int[] hand=new int[5];
	String[] suits={"c","d","h","s"};
	String[] ranks={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	
	int[] rankedCards=new int[52]; 
	int[] rankCounter=new int[13]; // Create an int array of size 13 to count the frequency of ranks 
	//variables used to generate actual rank of card
	int suit=-1; 
	int rank=-1;
	int cardRank=-1;
	String userEnteredSuit;
	String userEnteredRank;
	
	for (int k=0; k<hand.length;k++){
		suit=-1;
		rank=-1;
		while(true){
			System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
			userEnteredSuit=scan.next();
			for (int i=0;i<suits.length;i++){
				if(suits[i].equalsIgnoreCase(userEnteredSuit)) {
					suit=i;
					break;
				}
			}
			if (suit==-1){
				System.out.println("You did not enter a valid response!");
			}
			
			System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
			userEnteredRank=scan.next();
			for (int i=0;i<ranks.length;i++){
				if(ranks[i].equalsIgnoreCase(userEnteredRank)) {
					rank=i;
					break;
			}
		}
		if (rank==-1){
				System.out.println("You did not enter a valid response!");
			}
		cardRank=(suit*13)+rank; //actual card rank
		
		if(rankedCards[cardRank]!=0){
			System.out.println("You already entered that card!");
		}
		
		rankedCards[cardRank]=1;
		rankCounter[rank] +=1;
		hand[k]=cardRank;
		break;
		
	}//end of while(true)
}//end of for loop

showOneHand(hand);
return rankCounter;
}//end of generate hand method
  

public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }//end of method show one hand 
  
public static int[] generatePattern(int[] rankCounter){
	int[] rankPattern=new int[5];//The pattern of this array tells you the composition of the hand
	int rankHolder;
	
	for (int i=0;i<rankCounter.length;i++){
		rankHolder=rankCounter[i];
		rankPattern[rankHolder] +=1;
	}
	return rankPattern;
} //end of generate pattern method 

public static boolean comparePatterns(int[] array1, int[] array2){
	boolean areEqual=true;
	
	if(array1.length != array2.length){
		areEqual=false;
	}
	else {
		for (int i=0;i<array1.length; i++){
			if (array1[i] != array2[i]){
				areEqual=false;
			}
		}
	}

return areEqual;
}//end of compare patterns method


public static String matchPattern(int[] array){
	//Poker hands (of five cards) are ranked according to how likely they are,
	//with the rarer hand winning the round. 
	int[] straight={8,5,0,0,0};
	int[] fourOfAKind={11,1,0,0,1}; 
	int[] fullHouse={11,0,1,1,0};
	int[] threeOfAKind={10,2,0,1,0};
	int[] twoPairs={10,1,2,0,0};
	int[] onePair={9,3,1,0,0};
	
if (array[0]==11){
	if (comparePatterns(array, fourOfAKind)){
		return "Four of a Kind";
	}
	
	if (comparePatterns(array,fullHouse)){
		return "Full House";
	}
}
else if(array[0]==10){
	if (comparePatterns(array,threeOfAKind)){
		return "Three of a Kind";
	}
	if(comparePatterns(array, twoPairs)){
		return "Two Pairs";
	}
	}
	else {
		if (comparePatterns(array, straight)){
			return "Straight or High Card";
		}
		if (comparePatterns(array, onePair)){
			return "One Pair";
		}
	}
	
	return "No Match";
	
	}//end of match pattern method

  
}//end of class