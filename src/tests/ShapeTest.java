package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases. Test
	 * each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		Square sqr = new Square(4);
		Square sw1 = new Square(2);
		assertTrue(sqr.compareTo(sqr) == 0);
		assertTrue(sqr.compareTo(sw1) == 1);
		assertTrue(sw1.compareTo(sqr) == -1);
		
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(2);
		assertTrue(c1.compareTo(c1) == 0);
		assertTrue(c1.compareTo(c2) == 1);
		assertTrue(c2.compareTo(c1) == -1);
	}
}
