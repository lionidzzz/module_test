package myintproject;

import junit.framework.TestCase;

public class MyIntTest extends TestCase {
	
	public void testAdd() {
		MyInt myint = new MyInt("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		String to_test = "1";
		String res = myint.add(to_test);
		System.out.println("testAdd: " + myint.data + " + " + to_test + " answer is " + res);
		assertEquals("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", res);
	}

	public void testSubtract() {
		MyInt myint = new MyInt(99);
		String to_test = "1";
		String res = myint.subtract(to_test);
		System.out.println("testSubtract: " + myint.data + " - " + to_test + " answer is " + res);
		assertEquals("98", res);
	}
	
	public void testMultiply() {
		MyInt myint = new MyInt("0");
		String to_test = "10";
		String res = myint.multiply(to_test);
		System.out.println("testMultiply: " + myint.data + " * " + to_test + " answer is " + res);
		assertEquals("0", res);
	}
	
	public void testDivide() {
		MyInt myint = new MyInt("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		String to_test = "1";
		String res = myint.divide(to_test);
		System.out.println("testDivide: " + myint.data + " / " + to_test + " answer is " + res);
		assertEquals("100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", res);
	}
	
	public void testMax() {
		MyInt myint = new MyInt("5");
		String to_test = "1";
		String res = myint.max(to_test);
		System.out.println("testMax: " + myint.data + " or " + to_test + " answer is " + res);
		assertEquals("5", res);
	}
	
	public void testMin() {
		MyInt myint = new MyInt("5");
		String to_test = "1";
		String res = myint.min(to_test);
		System.out.println("testMin: " + myint.data + " or " + to_test + " answer is " + res);
		assertEquals("1", res);
	}
	
	public void testAbs() {
		String string = "-5";
		MyInt myint = new MyInt(string);
		String res = myint.abs(string);
		System.out.println("testAbs: " + myint.data + ". answer is " + res);
		assertEquals("5", res);
	}
	
	public void testCompareTo() {
		MyInt myint = new MyInt("1");
		String to_test = "4";
		String res = myint.compareTo(to_test);
		System.out.println("testCompareTo: " + myint.data + " compareTo " + to_test + " ANSWER IS " + res);
		assertEquals("-1", res);
	}
	
	public void testToString() {
		Integer temp = -5;
		MyInt myint = new MyInt(temp);
		String res = myint.toString(temp);
		System.out.println("testToString: " + myint.data + ". answer is " + res);
		assertEquals("-5", res);
	}
	
	public void testLongValue() {
		String string = "5555";
		MyInt myint = new MyInt(string);
		String res = myint.longValue(string);
		System.out.println("testLongValue: " + myint.data + ". answer is " + res);
		assertEquals("5555", res);
	}
	
	public void testGcd() {
		MyInt myint = new MyInt("50");
		String to_test = "10";
		String res = myint.gcd(to_test);
		System.out.println("testGcd: " + myint.data + " and " + to_test + " answer is " + res);
		assertEquals("10", res);
	}
	
	public void testSubtractWithBytes1() {
		MyInt myint = new MyInt(new byte[] { 1, 6, 0 });
		String to_test = "1";
		String res = myint.subtract(to_test);
		System.out.println("testSubtractWithBytes1: " + myint.data + " - " + to_test + " answer is " + res);
		assertEquals("-61", res);
	}
	
	public void testSubtractWithBytes2() {
		MyInt myint = new MyInt(new byte[] { 0, 6, 0 });
		String to_test = "1";
		String res = myint.subtract(to_test);
		System.out.println("testSubtractWithBytes2: " + myint.data + " - " + to_test + " answer is " + res);
		assertEquals("59", res);
	}

}
