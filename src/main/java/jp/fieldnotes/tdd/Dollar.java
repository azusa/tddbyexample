package jp.fieldnotes.tdd;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		amount = amount * multiplier;
		return null;
	}

}
