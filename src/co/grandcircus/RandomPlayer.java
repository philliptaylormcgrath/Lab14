package co.grandcircus;
//This player chooses at random. He's a professional
public class RandomPlayer extends Player {

	public RandomPlayer() {
		super();
	}
	@Override
	public Roshambo generateRoshambo(String input1) {
		int rng = (int)(Math.random()*3) +1;
		
		switch (rng) {
		case 1:
			
			return Roshambo.ROCK;

		case 2:
			return Roshambo.SCISSORS;
			
		default: 
			return Roshambo.PAPER;
		}
		
	}
	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		int rng = (int)(Math.random()*3) +1;
		switch (rng) {
		case 1:
			
			return Roshambo.ROCK;

		case 2:
			return Roshambo.SCISSORS;
			
		default: 
			return Roshambo.PAPER;
		}
	}
	
	@Override
	public String toString() {
		return "Rocky";
	}

}
