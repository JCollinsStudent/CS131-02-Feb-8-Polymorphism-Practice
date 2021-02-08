
public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(5);
		System.out.println(myCircle.getArea());
		
		Square mySquare = new Square(5);
		System.out.println(mySquare.getArea());
		
		Rectangle myRectangle = new Rectangle(5,3);
		System.out.println(myRectangle.getArea());
	}

}
