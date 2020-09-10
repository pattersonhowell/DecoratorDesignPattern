/**
 * @author pattersonhowell
 * Base class for a WeaponUpgrade playerdecorator
 */
public class WeaponUpgrade extends PlayerDecorator {

	private Player player;
	
	/**
	 * Setting up a player
	 * @param player Initializing player
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Calling player's original info and displaying upgrade type
	 */
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	
	/**
	 * Increasing player's power by (5) designated amount based upon upgrade
	 */
	public double getPower() {
		return player.getPower() + 5;
	}
}
