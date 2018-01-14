import java.util.Scanner;

/**
 * Console of the games
 * 
 * @author Jiranan Patrathamkul
 *
 */


/** 
 *  Play guessing game on the console.
 */
public class GameConsole {
	
	/**
	 * The play method plays a game using input from a user
	 * @param game is a new object of GuessingGame class
	 * @return the secret number which is "guess"
	 */
	
	

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// describe the game
		System.out.println( game.toString() );
		int guess = 0;
		boolean incorrect = false;
		
		// This is just an example.
		while (!incorrect) {
		System.out.println( game.getMessage() );
		System.out.print("Your answer? ");
		guess = Integer.parseInt(console.nextLine());
		incorrect = game.guess(guess);
		}
		System.out.println( game.getMessage() );
		return guess;
	}
	
}
