package Module_2_2;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle 
{
    public Square(double side) 
    {
        super(side, side);
    }

	
}
public class Rectangle_program 
{
	public static void main(String[] args) 
	{
		 Rectangle rectangle = new Rectangle(3,7);
	     	System.out.println("Area of rectangle:"+rectangle.area());
	        System.out.println("Perimeter of rectangle:"+rectangle.perimeter());

	        Square square = new Square(6);
	        System.out.println("Area of square:"+square.area());
	        System.out.println("Perimeter of square:"+square.perimeter());
	}
}
