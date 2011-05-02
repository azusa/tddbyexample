package jp.fieldnotes.tdd;

public class Dollar extends Money {

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object arg0) {
		Money dollar = (Money) arg0;
		return amount == dollar.amount;
	}

}
