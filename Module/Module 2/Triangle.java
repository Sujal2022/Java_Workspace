package Module_2_1;

public class Triangle 
{
	//global declaration
	 float s1, s2, s3;

	    public Triangle() 
	    {
	        s1 = 3;
	        s2 = 4;
	        s3 = 5;
	    }

	    public float getPerimeter() 
	    {
	        return s1 + s2 + s3;
	    }

	    public float getArea() 
	    {
	    	float s = getPerimeter() / 2;
	        return (float) Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	    }

	    public static void main(String[] args) {
	        Triangle triangle = new Triangle();
	        // display the area and perimeter of triangle
	        System.out.println("Perimeter of triangle is : " + triangle.getPerimeter() + " units");
	        System.out.println("Area of triangle is : " + triangle.getArea() + " square units");
	    }

}
