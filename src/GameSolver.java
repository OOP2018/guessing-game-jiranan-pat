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
		int secretNum = game.getUpperBound()/2;
		int constant = secretNum;
		int demo = 2;
		boolean incorrect = false;
		
		while (!incorrect) {
			System.out.println("\n"+game.getMessage());
			System.out.print("\nYour answer? ");
//			System.out.println(secretNum);
			if (game.getMessage().contains("large")) {
				secretNum = secretNum - constant/demo;
			} else if (game.getMessage().contains("small")) {
				secretNum = secretNum + constant/demo;
			}
			if (constant/demo>1) {
				demo = demo*2;
			}
			incorrect = game.guess(secretNum);
		}
		System.out.println("\n"+ game.getMessage() );

	return secretNum;
	}
}


