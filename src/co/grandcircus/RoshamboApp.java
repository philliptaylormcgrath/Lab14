package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		//This is the main app
		//User makes entries to play against our other player classes
		//Validate those entries
		//Keep track of wins and losses!
		//Player enters a name (names their own user player like an arcade entry)
		//Player also chooses an opponent. 'Rocky' or 'Randy,' but they're not what they seem...
		//Will prompt player to enter a choice (rock, paper, scissors) and then will display the choice of each player, as well as the winner (and counter will increase here
		
		int userChoice; //selects character
		
		RandomPlayer opponent = new RandomPlayer ();
		RockPlayer opponent2 = new RockPlayer();
		int counterWins = 0;
		int counterLosses = 0;
		int counterTies = 0;
		String inputName;
		String userCont = "y";
		String userWeapon;
		HumanPlayer user = new HumanPlayer();
		Scanner scan = new Scanner(System.in);
		inputName = Validator.getString(scan, "Enter a user name: ");
		System.out.println(inputName + " has entered the fray!");
		user.setName(inputName);
		do {
			userChoice = Validator.getInt(scan, "Select an opponent" + "\n" + "1. " + opponent + "\n" + "2. " + opponent2 + "\n" + "Press 1 or 2: ");
			
			if (userChoice == 1) {
				System.out.println("You have selected " + opponent + ". HE IS GOING TO 'ROCK' YOUR WORLD");
			
			}
			else if (userChoice == 2) {			
				System.out.println("You have selected " + opponent2 + "! PREPARE TO THROW DOWN");
					
			}
			else {
				System.out.println("Invalid user input! Must input either 1 or 2");
			}
			//scan.nextLine();
			userWeapon = Validator.getString(scan, ("Select your weapon!" + "\n" + "input Rock/Paper/Scissors: "));
			
			System.out.println("You have selected " + userWeapon);
			
			user.setUserChoice(userWeapon);
			Roshambo r1 = user.generateRoshambo(userWeapon);
			
			if (userChoice == 1) {
				Roshambo r2 = opponent.generateRoshambo();
				System.out.println("Randy " + r2);
				if (r1.equals(Roshambo.ROCK) && r2.equals(Roshambo.SCISSORS) || r1.equals(Roshambo.SCISSORS) && r2.equals(Roshambo.PAPER) || r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK)){
					System.out.println("The winner is " + user.getName());
					counterWins = counterWins+1;
					//r1 wins
				}
				else if (r1.equals(r2)) {
					System.out.println("The only bad result is a tie. This is a tie. BOOOOOO!");
					counterTies = counterTies +1;
				} else {
					System.out.println("The winner is " + opponent);
					counterLosses = counterLosses+1;
					 //r2 wins
				}
				
			} else if (userChoice == 2) {
				Roshambo r2 = opponent2.generateRoshambo();
				System.out.println("Rocky " + r2);
				if (r1.equals(Roshambo.ROCK) && r2.equals(Roshambo.SCISSORS) || r1.equals(Roshambo.SCISSORS) && r2.equals(Roshambo.PAPER) || r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK)){
					System.out.println("The winner is " + user.getName());
					counterWins = counterWins+1;
				
				}
				else if (r1.equals(r2)) {
					System.out.println("The only bad result is a tie. This is a tie. BOOOOOO!");
					counterTies = counterTies +1;
				} else {
					System.out.println("The winner is " + opponent2);
					
					counterLosses = counterLosses+1;
					
				}
			}
					
			
			userCont = Validator.getStringMatchingRegex(scan, "Would you like to play again? y/n: ","[YyNn]");
			
		} while (userCont.equalsIgnoreCase("y")); //program ends after user input become anything but 'y'
		scan.close();
		System.out.println("Final tally is: " + "\n" + counterWins + " wins!" + "\n" + counterLosses + " losses!" + "\n" + "And " + counterTies + " ties!");
		if (counterWins > counterLosses) {
			System.out.println("YOU ARE WINNER");
		} else if (counterWins < counterLosses) {
			System.out.println("You are a loser");
		} else {
			System.out.println("Perfectly balanced");
		}
	
		

	}

	
}

