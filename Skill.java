/**
 * @author pattersonhowell
 * Base class for a Skill playerdecorator
 */
public class Skill extends PlayerDecorator {

	private Player player;
	
	/**
	 * Setting up a player
	 * @param player Initializing player
	 */
	public Skill(Player player) {
		this.player = player;
	}
	
	/**
	 * Calling player's original info and displaying upgrade type
	 */
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	
	/**
	 * Increasing player's power by (2) designated amount based upon upgrade
	 */
	public double getPower() {
		return player.getPower() + 2;
	}
}
