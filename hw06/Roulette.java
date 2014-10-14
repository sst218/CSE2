//Stutti Tilwa
//CSE 2
//Section 111
//October 14, 2014
//hw06
//Roulette

//Uses a random number generator (recall Math.random()) to simulate this person’s betting on 100 spins,
//but also runs the simulation 1000 times and collects data on the outcome
//Computes the number of times I lose everything (my number never comes up), 
//compute the total winnings (of all simulations added together), 
//and compute the number of times I walked away with a profit in one session of 100 spins of the wheel.

public class Roulette {
    public static void main(String[] args) {
        
		//initializing variables 
		int winProfit = 0; // number of times walked away with profit
		int totalLose = 0; // number of times lose everything
		int totalWinnings = 0; // total winnings
		int repetitionCounter = 1; 
		int randomNumber; 
		int userNumber;
		
		while (repetitionCounter <= 1000) { //running similation 1000 times
			int win = 0; // number of times win in one session of 100 spins
			int spinCounter = 1;
			while (spinCounter <= 100) {
				randomNumber = (int) (Math.random() * 38); //must generate random number 
				userNumber=(int) (Math.random() * 38);// must generate random number the user picks
				if (userNumber == randomNumber) { //if user wins 
					win += 1;
					totalWinnings += 36;  //if number comes up one is given $36
				}
				spinCounter++;
			}
			if(win >= 3) { //if number comes up 3 or more times, one walks away with 3x$36=$108 or more.
				winProfit += 1;
			}
			else if(win == 0) { //computing losses 
				totalLose += 1; 
			}
			repetitionCounter++;
		}
		//printing out number of times I lose everything, total winnings, 
		//and number of times one walks away with a profit in one session of 100 spins of the wheel
		System.out.println("Number of times you lose everything - " + totalLose);
		System.out.println("Your total winnings out of $100,000 bet - $" + totalWinnings);
		System.out.println("Number of times you walked away with profit - " + winProfit);
		
        
    }//end of main method 
}//end of class