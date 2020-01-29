package challenges;

public abstract class Shape {

	public int x;
	public int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract String getShapeName();

	/**
	 * @return the perimeter of this shape
	 */
	public abstract double getPerimeter();
	
	/**
	 * @return the bounding box of this shape
	 */
	public abstract BoundingBox getBoundingBox();
}
