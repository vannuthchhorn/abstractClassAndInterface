package challenges;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// 1. Create the shapes
		Rectangle rectangle1 = new Rectangle(2, 2, 5, 9);
		Triangle triangle1 = new Triangle(4, 7, 7, 5);
		Square square1 = new Square(2, 2, 9);

		Rectangle rectangle2 = new Rectangle(2, 2, 5, 9);
		Triangle triangle2 = new Triangle(4, 7, 7, 5);
		Square square2 = new Square(2, 2, 9);

		// 2. Put all shapes into a array list
		List<Shape> shapes = Arrays.asList(rectangle1, triangle1, square1, rectangle2, triangle2, square2);

		
		// 3. Compute the sum of perimeters
		double sumOfperimeters = 0;
		for (Shape shape : shapes) {
			sumOfperimeters += shape.getPerimeter();
		}
		
		// 4. Print the result
		System.out.println("THe sum of perimeters is" + sumOfperimeters);
	}
}
