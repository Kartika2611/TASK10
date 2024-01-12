package taskq10;
import java.util.Scanner;

public class Circle { // Circle class 
	
	private double radius;// radius is declared as private
	public void Circle()//default constructor
	{
		System.out.println("Enter the radius of a circle");
	}
	public Circle(double r)//Parameterized constructor
	{
	this.radius=r;//class attribute and parameters with same name will confuse so this keyword is used
	}
	
	public double getcircumference()
	{
		 return 2*radius*Math.PI;//returning circumference of the circle.
	}
	
	
	public static void main(String[] args) 
	{
	int r=3; // radius is 3
	Circle obj=new Circle(3);//value is passed in the parameter
	System.out.println("The radius r:" +r);
	System.out.println("Circumference of the circle is:" + obj.getcircumference());//Circumference of circle is called using object

	}
	
}
