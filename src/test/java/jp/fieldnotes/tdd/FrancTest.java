package jp.fieldnotes.tdd;import static org.hamcrest.CoreMatchers.*;import static org.junit.Assert.*;import org.junit.Test;public class FrancTest {	@Test	public void francMultipliutation() throws Exception {		Money five = Money.franc(5);		assertThat(five.times(2), is(Money.franc(10)));		assertThat(five.times(3), is(Money.franc(15)));	}}