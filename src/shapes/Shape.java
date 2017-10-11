package shapes;

public abstract class Shape implements Comparable<Shape> {
	/*
	 * Implement compareTo such that shapes are compared by their areas. Follow
	 * the canonical expectations of compareTo interface. See Java API for
	 * expected behavior.
	 * 
	 * Also you need to finish implementing the Square and Circle classes.
	 */
	public int compareTo(Shape shape) {
		if(this.calculateArea() == shape.calculateArea()){
			return 0; 
		}
		else if(this.calculateArea() > shape.calculateArea())
			return 1;
		else return -1;
	}
	

	public abstract double calculateArea();
}
