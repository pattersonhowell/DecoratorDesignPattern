/**
 * @author pattersonhowell
 * Base class for a Warrior player 
 */
public class Warrior extends Player {
	
	/**
	 * Setting Warrior attributes
	 * @param name Assigns name to Warrior 
	 */
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * Displays player type and name, uses the generic parent method to display
	 * other info
	 */
	public String toString() {
		return "Warrior: " + name + super.toString();
	}
}
