package jp.fieldnotes.tdd;public class Franc extends Money {	private final String currency;	Franc(int amount) {		this.amount = amount;		this.currency = "CHF";	}	@Override	public Franc times(int multiplier) {		return new Franc(amount * multiplier);	}	@Override	String currency() {		return currency;	}}