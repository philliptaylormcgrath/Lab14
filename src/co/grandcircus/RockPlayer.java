package co.grandcircus;
//RockPlayer subclass, child to Player, always chooses rock, is bad.
public class RockPlayer extends Player {

	public RockPlayer() {
		
	}

	/*
	 * public RockPlayer(String name) { Super name; }
	 */
	@Override
	public Roshambo generateRoshambo(String input) {
		
		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return "Randy";
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

}
