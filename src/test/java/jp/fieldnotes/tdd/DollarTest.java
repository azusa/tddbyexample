package jp.fieldnotes.tdd;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;



public class DollarTest {


	@Test
	public void multiPlication() throws Exception {
		Dollar five = new Dollar(5);
		five.times(2);
		assertThat(five.amount, is(10));
	}
}
