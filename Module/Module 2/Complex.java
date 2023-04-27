package Module_2_1;

import java.util.Scanner;

public class Complex 
{
	  double real;
	  double imaginary;

	    public Complex(double real, double imaginary) 
	    {
	        this.real = real;
	        this.imaginary = imaginary;
	    }
	    public void printComplex() 
	    {
	        System.out.println(real + " + " + imaginary + "i");
	    }
	    public static Complex add(Complex c1, Complex c2) 
	    {
	        double realSum = c1.real + c2.real;
	        double imaginarySum = c1.imaginary + c2.imaginary;
	        return new Complex(realSum, imaginarySum);
	    }
	    public static Complex subtract(Complex c1, Complex c2) 
	    {
	        double realDifference = c1.real - c2.real;
	        double imaginaryDifference = c1.imaginary - c2.imaginary;
	        return new Complex(realDifference, imaginaryDifference);
	    }
	    public static Complex multiply(Complex c1, Complex c2) 
	    {
	        double realProduct = c1.real * c2.real - c1.imaginary * c2.imaginary;
	        double imaginaryProduct = c1.real * c2.imaginary + c1.imaginary * c2.real;
	        return new Complex(realProduct, imaginaryProduct);
	    }
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter the real and imaginary parts of the first complex number:");
	        double real1 = input.nextDouble();
	        double imaginary1 = input.nextDouble();

	        System.out.println("Enter the real and imaginary parts of the second complex number:");
	        double real2 = input.nextDouble();
	        double imaginary2 = input.nextDouble();

	        Complex c1 = new Complex(real1, imaginary1);
	        Complex c2 = new Complex(real2, imaginary2);

	        System.out.println("The sum of the complex numbers is:");
	        Complex sum = Complex.add(c1, c2);
	        sum.printComplex();

	        System.out.println("The difference of the complex numbers is:");
	        Complex difference = Complex.subtract(c1, c2);
	        difference.printComplex();

	        System.out.println("The product of the complex numbers is:");
	        Complex product = Complex.multiply(c1, c2);
	        product.printComplex();
	    }
}
