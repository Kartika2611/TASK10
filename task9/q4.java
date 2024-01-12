package task9;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) 
	{
            Scanner sc = new Scanner(System.in);
			System.out.print("Enter the value: ");
			int a = sc.nextInt();
			
			for(int i=1; i<=a; i++)
			{
			for(int j=1; j<=a;j++)
			{
			 if(j==i || j+i==a+1 )
			 {
				 System.out.print("*");
			 }
			 System.out.print("");
			}
			 System.out.println("");
			}
			
		}

}
