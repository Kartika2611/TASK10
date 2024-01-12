package task9;
import java.util.Scanner;

public class q6 {
public static void main(String[] args) 
{
				
	int month,days;
	float rent;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the month: ");
	month = sc.nextInt();
	System.out.print("How many days: ");
	days=sc.nextInt();
	System.out.print("rent of the room: ");
	rent=sc.nextFloat();


	switch(month)
	{
	case 1,2,3,7,8,9,10:

	float total=days*rent;
	System.out.println();
	System.out.print("Total rent: ");
	System.out.format("%.2f",total );
	break;

	case 4,5,6,11,12:

	float total1=days*rent;
	//System.out.println("total rent: " +total);

	float hikedays=(total1/100) * 20;
	//System.out.println("seasonal revised rent:" +hikedays);

	hikedays=total1+hikedays;
	System.out.println();
	System.out.println("seasonal revised rent:");
	System.out.format("%.2f",hikedays);
	break;

			}
		}

}

