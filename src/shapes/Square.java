package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares must have a positive side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		// TODO Implement me
		if (side <= 0) {
			throw new IllegalArgumentException("Side cannot be negative");
		}
		else {
			this.side = side;
		}
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */
 
	// method calculateArea was overridden from the shape class and returns the area of the square
	@Override
	public double calculateArea() {
		return side * side;
	}
	
	public double getSide() {
		return side;
	}
}
