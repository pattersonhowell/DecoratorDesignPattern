/**
 * @author pattersonhowell
 * Base class for a Mage player
 */
public class Mage extends Player {

	/**
	 * Setting Mage attributes
	 * @param name Assigns name to Mage 
	 */
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staf";
		this.armor = "Robe";
	}
	
	/**
	 * Displays player type and name, uses the generic parent method to display
	 * other info
	 */
	public String toString() {
		return "Mage: " + name + super.toString();
	}
}
