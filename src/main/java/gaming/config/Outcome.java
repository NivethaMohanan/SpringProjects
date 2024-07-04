package gaming.config;

public enum Outcome {
	WIN("You've won!"), LOSE("You've lost!"), TIE("It's a tie!"), PLAY_AGAIN("Invalid user gesture!");

	private final String outcomeValue;

	Outcome(String outcomeValue) {
		this.outcomeValue = outcomeValue;
	}

	public String getOutcomeValue() {
		return outcomeValue;
	}
}
