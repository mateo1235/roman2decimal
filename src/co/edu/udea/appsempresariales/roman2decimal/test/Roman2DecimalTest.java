package co.edu.udea.appsempresariales.roman2decimal.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import co.edu.udea.appsempresariales.roman2decimal.main.Roman2Decimal;

public class Roman2DecimalTest {
	
	private Roman2Decimal r2d;

	@Before
	public void setUp() throws Exception {
		r2d = new Roman2Decimal();
	}

	@Test
	public void testOne() {
		int actual = r2d.convert("I");
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTwo() {
		int actual = r2d.convert("II");
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testFour() {
		int actual = r2d.convert("IV");
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testEight() {
		int actual = r2d.convert("VIII");
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNine() {
		int actual = r2d.convert("IX");
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test19() {
		int actual = r2d.convert("XIX");
		int expected = 19;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test99() {
		int actual = r2d.convert("IC");
		int expected = 99;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test47() {
		int actual = r2d.convert("XLVII");
		int expected = 47;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test388() {
		int actual = r2d.convert("CCCLXXXVIII");
		int expected = 388;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test398() {
		int actual = r2d.convert("CCCXCVIII");
		int expected = 398;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test788() {
		int actual = r2d.convert("DCCLXXXVIII");
		int expected = 788;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test998() {
		int actual = r2d.convert("CMXCVIII");
		int expected = 998;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test1000() {
		int actual = r2d.convert("M");
		int expected = 1000;
		assertEquals(expected, actual);
	}
	
	@Test
	public void test998Lower() {
		int actual = r2d.convert("cmxcviii");
		int expected = 998;
		assertEquals(expected, actual);
	}
	
	public void test788Mixed() {
		int actual = r2d.convert("DcClxXxviIi");
		int expected = 788;
		assertEquals(expected, actual);
	}

}
