
public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double r) {
		super();
		this.radius = r;
		calculateArea();
	}

	@Override
	protected void calculateArea() {
		// TODO Auto-generated method stub
		area = Math.PI * Math.pow(radius, 2);
	}

	double getArea() {
		return area;
	}
}
