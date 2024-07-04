package gaming;

import gaming.config.Gesture;
import gaming.config.Outcome;

public interface Game {
	
	/**
	 * Plays the Paper-Rock-Scissors game and returns the outcome
	 * @param userGesture
	 * @param computerMove
	 * @return outcomeMessage
	 */
	String play(String userGesture, Gesture computerMove); 
	
	/**
	 * Determines the winner by applying the rules of the Paper-Rock-Scissors game
	 * 
	 * @param playerGesture
	 * @param computerMove
	 * @return outcome
	 */
	Outcome determineWinner(String playerGesture, Gesture computerMove);

}
