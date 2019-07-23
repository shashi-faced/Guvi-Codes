import java.util.Scanner;
import java.util.*;


public class check1
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		if(num == 0)
		{
			System.out.println("Zero");
		}
		else if(num < 0)
		{
			System.out.println("Negative");
		}
		else if(num > 0)
		{
			System.out.println("Positive");
		}
	}
}