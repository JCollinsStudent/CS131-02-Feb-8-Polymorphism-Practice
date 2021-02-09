
public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		super();
		this.length = l;
		this.width = w;
		calculateArea();
		
	}
	
	protected void calculateArea() {
		area = this.length * this.width;
	}
	
	double getArea() {
		return area;
	}
}
