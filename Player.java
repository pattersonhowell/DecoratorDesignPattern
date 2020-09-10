/**
 * @author pattersonhowell
 * Abstract Base class of any player
 */
public abstract class Player {

	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * Generic string for any player
	 */
	public String toString() {
		return "\nCarries a " + weapon + ", and wears a " + armor;
	}
	
	/**
	 * Calculate player power using given formula
	 * @return
	 */
	public double getPower() {
		return attack * 3 + defense + intellect / 2;
	}
}
