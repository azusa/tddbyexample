package jp.fieldnotes.tdd;

public class Dollar extends Money {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object arg0) {
		Dollar dollar = (Dollar) arg0;
		return amount == dollar.amount;
	}

}
