package jp.fieldnotes.tdd;import static org.hamcrest.CoreMatchers.*;import static org.junit.Assert.*;import org.junit.Test;public class MoneyTest {	@Test	public void currency() throws Exception {		assertThat("USD", is(Money.dollar(1).currency()));		assertThat("CHF", is(Money.franc(1).currency()));	}	@Test	public void simpleAddition() throws Exception {		Money five = Money.dollar(5);		Expression sum = five.plus(five);		Bank bank = new Bank();		Money reduced = bank.reduce(sum, "USD");		assertThat(reduced, is(Money.dollar(10)));	}	@Test	public void plusReturnsSum() {		Money five = Money.dollar(5);		Expression result = five.plus(five);		Sum sum = (Sum) result;		assertThat(sum.augend, is(five));		assertThat(sum.addend, is(five));	}	@Test	public void reduceSum() throws Exception {		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));		Bank bank = new Bank();		Money result = bank.reduce(sum, "USD");		assertThat(result, is(Money.dollar(7)));	}	@Test	public void reduceMoney() throws Exception {		Bank bank = new Bank();		Money result = bank.reduce(Money.dollar(1), "USD");		assertThat(result, is(Money.dollar(1)));	}}