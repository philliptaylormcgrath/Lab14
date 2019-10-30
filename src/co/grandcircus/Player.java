package co.grandcircus;
//Player class, abstract, all other players are children to this abstract class. Which means they will need to implement the methods of this class
//Should also have a "generateRoshambo" method
//Should also have a method that stores a name



public abstract class Player {
	
	
	private String name;

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public abstract Roshambo generateRoshambo();
	
	public abstract Roshambo generateRoshambo(String input);
	
	/*public String toString() {
		return name;*/
	//}
	
}