/**
 * @author pattersonhowell
 * Base class for a Healer player 
 */
public class Healer extends Player {

	/**
	 * Setting Healer attributes
	 * @param name Assigns name to Healer 
	 */
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays player type and name, uses the generic parent method to display
	 * other info
	 */
	public String toString() {
		return "Healer: " + name + super.toString();
	}
}
