package gaming;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import gaming.config.Gesture;
import gaming.config.Outcome;


/**
 * Unit test for Paper-Rock-Scissor Game.
 */
public class PaperRockScissorTest {

	private PaperRockScissor testGame;

	@BeforeEach
	public void setUp() {
		testGame = new PaperRockScissor();
	}

	private boolean isValidValue(String[] expectedValues, String actual) {
		for (String expected : expectedValues) {
			if (expected.equals(actual)) {
				return true;
			}
		}
		return false;
	}

	@Test()
	@DisplayName("Display outcome of the game when there's a valid gesture")
	public void testOutcomeMessageForValidGesture() {
		String[] expectedOutcome = { Outcome.WIN.getOutcomeValue(), Outcome.LOSE.getOutcomeValue(),
				Outcome.TIE.getOutcomeValue() };
		String actualOutcome1 = testGame.play("fist", Gesture.PAPER).split("\n")[1].trim();
		assertTrue(isValidValue(expectedOutcome, actualOutcome1));
		String actualOutcome2 = testGame.play("openhand", Gesture.ROCK).split("\n")[1].trim();
		assertTrue(isValidValue(expectedOutcome, actualOutcome2));
		String actualOutcome3 = testGame.play("twofingers", Gesture.SCISSORS).split("\n")[1].trim();
		assertTrue(isValidValue(expectedOutcome, actualOutcome3));
	}

	@Test
	@DisplayName("Declare the outcome as tie when there's a same gesture from the user and the computer")
	public void testTie() {
		assertEquals(Outcome.TIE.getOutcomeValue(), testGame.play("fist", Gesture.ROCK).split("\n")[1].trim());
		assertEquals(Outcome.TIE.getOutcomeValue(), testGame.play("openhand", Gesture.PAPER).split("\n")[1].trim());
		assertEquals(Outcome.TIE.getOutcomeValue(),
				testGame.play("twofingers", Gesture.SCISSORS).split("\n")[1].trim());
	}

	@Test
	@DisplayName("Declare user as winner when the user wins")
	public void testWin() {
		assertEquals(Outcome.WIN.getOutcomeValue(), testGame.play("fist", Gesture.SCISSORS).split("\n")[1].trim());
		assertEquals(Outcome.WIN.getOutcomeValue(), testGame.play("openhand", Gesture.ROCK).split("\n")[1].trim());
		assertEquals(Outcome.WIN.getOutcomeValue(), testGame.play("twofingers", Gesture.PAPER).split("\n")[1].trim());
	}

	@Test
	@DisplayName("Declare user as a loser when the user loses")
	public void testLose() {
		assertEquals(Outcome.LOSE.getOutcomeValue(), testGame.play("fist", Gesture.PAPER).split("\n")[1].trim());
		assertEquals(Outcome.LOSE.getOutcomeValue(), testGame.play("openhand", Gesture.SCISSORS).split("\n")[1].trim());
		assertEquals(Outcome.LOSE.getOutcomeValue(), testGame.play("twofingers", Gesture.ROCK).split("\n")[1].trim());
	}

	@Test
	@DisplayName("Report when there's an invalid Gesture")
	public void testExit() {
		assertEquals(Outcome.PLAY_AGAIN.getOutcomeValue(), testGame.play("", Gesture.ROCK).split("\n")[1].trim());
		assertEquals(Outcome.PLAY_AGAIN.getOutcomeValue(), testGame.play("exit", Gesture.ROCK).split("\n")[1].trim());
		assertEquals(Outcome.PLAY_AGAIN.getOutcomeValue(), testGame.play(null, Gesture.ROCK).split("\n")[1].trim());
		assertEquals(Outcome.PLAY_AGAIN.getOutcomeValue(), testGame.play("other gesture", Gesture.ROCK).split("\n")[1].trim());
	}

}
