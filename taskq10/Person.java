package taskq10;
import java.util.Scanner;

public class Person 
{
	private int age; // Storing the age as integers
	private String name;//Storing the name as string

	public Person(String name,int age)// Parameterized constructor is used and memory is allocated
	{
	this.name = name;
	this.age = age;
	}
	public String getname()//getter method is used
	{
	return name;
	}
	public int getage()//getter method is used
	{
		return age;
	}

		public static void main(String[] args) 
		
	{
		Scanner sc = new Scanner(System.in);//Getting the object during runtime
		System.out.println("Enter the name");
		String name = sc.next();//getting name using scanner
		System.out.println("Enter the age");
		int age = sc.nextInt();//getting age using scanner
			
	}
}

		

