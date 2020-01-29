package challenges;

public class Square extends Shape {
	private int size;

	/**
	 * The default constructor creates a square at 0,0 with size = 50 
	 */
	public Square() {
		this(0, 0, 50);		// this will call the constructor  below
	}
	
	public Square(int x, int y, int s) {
		super(x, y);		// this will call the constructor of the parent
		this.size = s;
	}
	public String getShapeName() {
		return "Square";
	}
	
	@Override
	public double getPerimeter() {
		return (this.size) * 4;
	}
	
	@Override
	public BoundingBox getBoundingBox() {
		return new BoundingBox(x, y, size, size);
	}
}
