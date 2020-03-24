package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.ESII;

// TODO: Auto-generated Javadoc
/**
 * The Class ESII_test.
 */
class ESII_test {

	public ESII test;
	
	/**
	 * Change.
	 */
	@Test
	void change() {
		test = new ESII();
		assertEquals(0,test.a);
		assertEquals(0,test.b);
		test.change(10);
		assertEquals(10, test.a);
		assertEquals(20, test.b);
	}

}
