package gaming;

import gaming.config.Gesture;
import gaming.config.Outcome;

/**
 * 
 */
public class PaperRockScissor implements Game {

	/**
	 * Determines the winner by applying the rules of the Paper-Rock-Scissors game
	 * 
	 * @param playerGesture
	 * @param computerMove
	 * @return outcome
	 */
	@Override
	public Outcome determineWinner(String playerGesture, Gesture computerMove) {
		Gesture playerMove = Gesture.toGesture(playerGesture);
		if (playerMove == null) {
			return Outcome.PLAY_AGAIN;
		} else if (playerMove == computerMove) {
			return Outcome.TIE;
		} else {
			switch (playerMove) {
			case PAPER:
				return (computerMove == Gesture.SCISSORS) ? Outcome.LOSE : Outcome.WIN;
			case ROCK:
				return (computerMove == Gesture.PAPER) ? Outcome.LOSE : Outcome.WIN;
			case SCISSORS:
				return (computerMove == Gesture.ROCK) ? Outcome.LOSE : Outcome.WIN;
			default:
				return Outcome.PLAY_AGAIN;
			}
		}

	}

	/**
	 * Plays the Paper-Rock-Scissors game and returns the outcome
	 * 
	 * @param userGesture
	 * @param computerMove
	 * @return outcome message
	 */
	@Override
	public String play(String userGesture, Gesture computerMove) {
		Outcome outcome;
		if (userGesture != null && !userGesture.isEmpty()) {
			outcome = determineWinner(userGesture, computerMove);
		} else {
			outcome = Outcome.PLAY_AGAIN;
		}
		return "Computer gesture: " + computerMove.getGestureValue() + " (" + computerMove + ")" + "\n"
				+ outcome.getOutcomeValue();

	}

}
