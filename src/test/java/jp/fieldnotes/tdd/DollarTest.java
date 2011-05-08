package jp.fieldnotes.tdd;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void multiPlication() throws Exception {
		Money five = Money.dollar(5);
		assertThat(five.times(2), is((Expression) Money.dollar(10)));
		assertThat(five.times(3), is((Expression) Money.dollar(15)));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));

	}
}
