import java.util.Scanner;
import java.util.*;

public class check11
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = 1;
		for(int i  = 0;i<k;i++)
			sum = sum*n;
		System.out.println(sum);
	}
}