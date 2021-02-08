
public class Square extends Rectangle{
	private double side;
	
	public Square(double s) {
		super(s, s);
		this.side = s;
		calculateArea();
	}
	
	protected void calculateArea() {
		super.area = this.side * this.side;
	}
	
	double getArea() {
		return super.area;
	}
}
