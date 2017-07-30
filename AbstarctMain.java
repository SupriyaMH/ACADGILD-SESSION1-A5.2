package assignments;

public class AbstarctMain {

	public static void main(String[] args) {
		Rectangle r= new Rectangle(4,8);
		r.findArea();
		r.findPerimeter();
		Circle c=new Circle(4);
		c.findArea();
		c.findPerimeter();
		Triangle t=new Triangle(3,4,5);
		t.findArea();
		t.findPerimeter();

	}

}
