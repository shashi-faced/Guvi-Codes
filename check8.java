import java.util.Scanner;
import java.util.*;

public class check8
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n > 0 )
		{
			int temp = n%10;
	        n = n/10;
			sum+= 1;
		}
			System.out.println(sum);
	}
}