package gaming.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum Gesture {
	PAPER("openhand"), ROCK("fist"), SCISSORS("twofingers");

	private static final Map<String, Gesture> stringToGesture = new HashMap<>();
	private final String strGesture;
	
	static {
        for (Gesture gesture : Gesture.values()) {
        	stringToGesture.put(gesture.strGesture, gesture);
        }
    }

	Gesture(String strGesture) {
		this.strGesture = strGesture;
	}

	public String getGestureValue() {
		return this.strGesture;
	}
	
	public static Gesture toGesture(String strGesture) {
		return stringToGesture.get(strGesture);
	}

	public static Gesture getRandomMove() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}

}