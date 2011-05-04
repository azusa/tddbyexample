package jp.fieldnotes.tdd;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = "USD";
	}

	@Override
	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	@Override
	String currency() {
		return currency;
	}

}
