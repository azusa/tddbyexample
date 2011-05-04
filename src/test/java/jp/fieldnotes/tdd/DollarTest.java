package jp.fieldnotes.tdd;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void multiPlication() throws Exception {
		Dollar five = new Dollar(5);
		assertThat(five.times(2), is(new Dollar(10)));
		assertThat(five.times(3), is(new Dollar(15)));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));

	}
}
