package challenges;

public class Triangle extends Shape {
	private int width;
	private int height;

	/**
	 * The default constructor creates a triangle  at 0,0 with width = 20 and height= 30 
	 */
	public Triangle() {
		this(0,0 ,20, 30);		// this will call the constructor  below
	}
	
	public Triangle(int x, int y, int w, int h) {
		super(x, y);			// this will call the constructor of the parent
		this.width = w;
		this.height = h;
	}
	public String getShapeName() {
		return "Triangle";
	}

	@Override
	public double getPerimeter() {
		
		// hypothenus = sqrt(width² + height²)
		double hypothenus = Math.sqrt(width*width + height*height);
		return  this.width+ this.height + hypothenus;
	}

	@Override
	public BoundingBox getBoundingBox() {
		return new BoundingBox(x, y, width, height);
	}
}
