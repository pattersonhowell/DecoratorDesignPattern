/**
 * @author pattersonhowell
 * Abstract base class of a PlayerDecorator 
 */
public abstract class PlayerDecorator extends Player {

	/**
	 * calling toString() from child classes
	 */
	public abstract String toString();
		
	/**
	 * calling getPower() from child classes
	 */
	public abstract double getPower();
	
	
}
