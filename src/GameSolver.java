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
		int min = 1;
		int max = game.getUpperBound();
		int secretNum = min + (max - min)/2;
		
		while (!game.guess(secretNum)) {
			if (game.getMessage().contains("too large")) {
				max = secretNum -1;
				secretNum = min + (max - min)/2;
			} else if (game.getMessage().contains("too small")) {
				min = secretNum + 1;
				secretNum = min + (max - min)/2;
			}
		}
		return secretNum;
	}
}


