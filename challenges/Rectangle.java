package challenges;

public class Rectangle extends Shape {
	private int width;
	private int height;

	/**
	 * The default constructor creates a rectangle at 0,0 with width = 20 and height= 30 
	 */
	public Rectangle() {
		this(0,0, 20, 30);	// this will call the constructor  below
	}
	
	public Rectangle(int x, int y, int w, int h) {
		super(x, y);		// this will call the constructor of the parent
		this.width = w;
		this.height = h;
	}
	public String getShapeName() {
		return "Rectangle";
	}

	@Override
	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

	@Override
	public BoundingBox getBoundingBox() {
		return new BoundingBox(x, y, width, height);
	}
}
