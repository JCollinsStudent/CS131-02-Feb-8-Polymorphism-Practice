
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
		super.area = this.length * this.width;
	}
	
	double getArea() {
		return super.area;
	}
}
