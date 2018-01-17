/**
 * This class is a class that build for the game to solve themselves.
 * 
 * @author Jiranan Patrathamakul
 *
 */
public class GameSolver {
	
	/**
	 * The play method plays a game by themselves.
	 * 
	 * @param game is a new object of GuessingGame class
	 * @return the secret number which is "secretNumber"
	 */
	
	public int play (NumberGame game) {
		System.out.println( game.toString() );
		int secretNum = (game.getUpperBound()-1)/2;
		int constant = secretNum;
		int denominator= 2;
		System.out.print("\nYour answer? ");
		
		while (!game.guess(secretNum)) {
			System.out.println("\n"+game.getMessage());
			System.out.print("\nYour answer? ");
			if (game.getMessage().contains("large")) {
				secretNum = secretNum - constant/denominator;
			} else if (game.getMessage().contains("small")) {
				secretNum = secretNum + constant/denominator;
			}
			if (constant/denominator>1) {
				denominator = denominator*2;
			}
		}
		System.out.println("\n"+ game.getMessage() );

	return secretNum;
	}
}


