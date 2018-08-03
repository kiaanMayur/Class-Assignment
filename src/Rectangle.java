/*instance members -> length, breadth
behaviours -> calculate the area of rectangle*/
public class Rectangle {

	private int length;
	private int breadth;
	
	//c'tor with arguments
	public Rectangle(int length, int breadth) {
		//super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle() {
		
		this(1,1);
		//System.out.println("Object created!");
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	// area of a rectangle
	public int Area() {
		
		return (length * breadth);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
}
