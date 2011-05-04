package jp.fieldnotes.tdd;

public class Dollar extends Money {

	private final String currency;

	public Dollar(int amount) {
		this.amount = amount;
		this.currency = "USD";
	}

	@Override
	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}

}
