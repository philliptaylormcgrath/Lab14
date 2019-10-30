package co.grandcircus;
//Requires method to convert the enum elements toString
public enum Roshambo {
ROCK, PAPER, SCISSORS;
	
	public String toString() {
		switch (this) {
		case ROCK:
			
			return "selected Rock";
		case PAPER:
			return "selected Paper";
			
		
		default:
			return "selected Scissors";
		}
}

	
}
