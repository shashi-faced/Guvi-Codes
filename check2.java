import java.util.Scanner;
import java.util.*;


public class check2
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		if(num%2 == 0)
		{
			System.out.println("Even");
		}
		else if(num%2 == 1)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}