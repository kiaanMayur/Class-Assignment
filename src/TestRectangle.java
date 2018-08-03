import java.util.*;

/*class to test the Rectangle class*/
public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// instantiating the objects of Distance class
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle_II = new Rectangle();
		System.out.println(rectangle);
		
		
		System.out.println("Enter the length of the rectangle 1");
		int rectangleLength = scanner.nextInt();
		
		System.out.println("Enter the breadth of the rectangle 1");
		int rectangleBreadth = scanner.nextInt();
		

		System.out.println("Enter the length of the rectangle 2");
		int rectangle_IILength = scanner.nextInt();
		
		System.out.println("Enter the breadth of the rectangle 2");
		int rectangle_IIBreadth = scanner.nextInt();
		
		rectangle.setLength(rectangleLength);
		rectangle.setBreadth(rectangleBreadth);
		
		rectangle_II.setLength(rectangle_IILength);
		rectangle_II.setBreadth(rectangle_IIBreadth);
		
		if((rectangle.getLength() != rectangle_II.getLength()) || (rectangle.getBreadth() != rectangle_II.getBreadth())) {
			
			if(rectangle.Area() == rectangle_II.Area())
				System.out.println("Both the rectangles have same area. \n" + rectangle.Area());
		}
		
		else {
			
			System.out.println(rectangle + "\nArea of first rectangle is: " + rectangle.Area());
			System.out.println(rectangle_II + "\nArea of second rectangle is: " + rectangle_II.Area());
		}
	}
}
