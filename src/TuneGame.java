import java.util.Random;

/**
 * 
 * Game of guessing a secret number
 * 
 * @author Jiranan Patrathamakul
 *
 */
public class TuneGame extends NumberGame {
	private int upperBound;
	private int secret;
	private int count;
	
	/**
	 * Initialize a new game
	 * 
	 * @param upperBound is the max value for the secret number (>)
	 */
	
	public TuneGame (int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		super.setMessage("I'm thinking of a number between 1 to " +upperBound);
		
	}
	
	/**
	 * To check a number user guessed if it's right or wrong.
	 * 
	 * @param guessNumber is a number that user guess.
	 * @return boolean for guessing.
	 */
	
	public boolean guess (int guessNumber) {
		this.count++;
		if (guessNumber == this.secret) {
			if (this.count == 1) {
				setMessage("Correct. The secret is " + this.secret + "\nYou guess " + getCount() + " time");
			} else {
			setMessage("Correct. The secret is " + this.secret + "\nYou guess " + this.count + " times");
			}
			return true;
		} else if (guessNumber > this.secret) {
			setMessage("Sorry, your guess is too large");
		} else if (guessNumber < this.secret) {
			setMessage("Sorry, your guess is too small");
		}
		return false;
	}
	
	
	/**
	 * Return a upperBound of the game.
	 * 
	 * @return a upperBound of the game.
	 */
	public int getUpperBound () {
		return upperBound;
	}
	
	
	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber (int limit) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit)+1;
	}
	
	/**
	 * Return a number of how many time user have guessed.
	 * 
	 * @return number of how many time user have guessed
	 */
	
	public int getCount() {
		return this.count;
	}
	
	/**
     * toString is to describes the game.
     * @return description how the game work.
     */
	
	@Override
    public String toString() {
    	return "A guessing game";
    }
}
