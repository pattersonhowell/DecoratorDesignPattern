/**
 * @author pattersonhowell
 * Base class for an ArmorUpgrade playerdecorator
 */
public class ArmorUpgrade extends PlayerDecorator {

	private Player player;
	
	/**
	 * Setting up a player
	 * @param player Initializing player
	 */
	public ArmorUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * Calling player's original info and displaying upgrade type
	 */
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	
	/**
	 * Increasing player's power by (3) designated amount based upon upgrade
	 */
	public double getPower() {
		return player.getPower() + 3;
	}
}
