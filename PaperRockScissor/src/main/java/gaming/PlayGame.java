package gaming;

import java.util.Scanner;

import gaming.config.Gesture;

public class PlayGame {

	/*
	 * Takes user gesture via keyboard as one of the following values: fist, openhand, twofingers
	 * and displays outcome of the game instance
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PaperRockScissor game = new PaperRockScissor();
		while (true) {
			System.out.println("Show your gesture:(fist, openhand, twofingers):");
			String userGesture = scanner.nextLine().toLowerCase();
			Gesture computerGesture = Gesture.getRandomMove();
			String outcome = game.play(userGesture, computerGesture);
			System.out.println(outcome);
		}

	}

}
