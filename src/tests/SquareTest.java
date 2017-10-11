package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class SquareTest {

	private final double DELTA = 0.0000000000001;
	@Test
	public void testCalculateArea() {
		Square s = new Square(3);
		assertEquals(9, s.calculateArea(), DELTA);
	}

	@Test
	public void testSquare() {
		Square s = new Square(1);
		assertEquals(1, s.getSide(), DELTA);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeCircle() {
		new Square(-1);
	}

	@Test
	public void testGetSide() {
		Square s = new Square(5);
		assertEquals(5, s.getSide(), DELTA);
	}

}
