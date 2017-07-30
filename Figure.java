package assignments;

public abstract class Figure {
	public abstract void findArea();
	public abstract void  findPerimeter();

}

class Circle extends Figure
{
int dim1;
double pi=3.14;

public Circle (int dim1)
{
	this.dim1=dim1;
}
	public void findArea() {
	System.out.println("area of circle is:" +(pi*dim1*dim1));
		
	}

	@Override
	public void findPerimeter() {
	System.out.println("perimeter of circle is:"+(2*pi*dim1));
		
	}
	
}

class Rectangle extends Figure
{
int dim1,dim2;
public Rectangle(int dim1, int dim2)
{
	this.dim1=dim1;
	this.dim2=dim2;
}
	@Override
	public void findArea() {
		System.out.println("area of rectangle is:"+ (dim1*dim2));
		
	}

	@Override
	public void findPerimeter() {
		System.out.println("perimeter of rectangle is:"+(2*(dim1*dim2)));
		
	}
	
}
class Triangle extends Figure
{
int dim1, dim2, dim3;
	public Triangle(int dim1, int dim2, int dim3)
	{
		this.dim1=dim1;
		this.dim2=dim2;
		this.dim3=dim3;
		
	}
	@Override
	public void findArea() {
		System.out.println("area of circle is:" +(dim1+dim2+dim3)/2);
		
	}

	@Override
	public void findPerimeter() {
		System.out.println("perimeter of triangle is:" +(dim1+dim2+dim3));
		
	}
	
}