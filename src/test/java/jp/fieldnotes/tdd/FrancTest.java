package jp.fieldnotes.tdd;import static org.hamcrest.CoreMatchers.*;import static org.junit.Assert.*;import org.junit.Test;public class FrancTest {	@Test	public void francMultipliutation() throws Exception {		Franc five = new Franc(5);		assertThat(five.times(2), is(new Franc(10)));		assertThat(five.times(3), is(new Franc(15)));	}}