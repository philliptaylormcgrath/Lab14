package co.grandcircus;
//This is the user. Make a method that creates the human player with the name input
public class HumanPlayer extends Player {

private String userChoice;
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
		
	}
	
	public String getUserChoice() {
		return userChoice;
		
	}
	@Override
	public Roshambo generateRoshambo(String input1) {
		if (input1.equalsIgnoreCase("rock")){
			return Roshambo.ROCK;
		}
		else if (input1.equalsIgnoreCase("paper")) {
			return Roshambo.PAPER;
		}
		else {// (input1.equalsIgnoreCase("scissors")) {
			return Roshambo.SCISSORS;
		}
		
		
	}
public String toString() {
	return null;
}

@Override
public Roshambo generateRoshambo() {
	// TODO Auto-generated method stub
	return null;
}
}
