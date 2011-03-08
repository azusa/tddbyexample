package jp.fieldnotes.tdd;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

	@Test
	public void multiPlication() throws Exception {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertThat(product.amount, is(10));
		product = five.times(3);
		assertThat(product.amount, is(15));
	}

	@Test
	public void equality() throws Exception {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
	}
}
