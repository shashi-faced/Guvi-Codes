import java.util.Scanner;
import java.util.*;

public class check9
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i  = 0;i<n;i++)
			arr[i] = sc.nextInt();
		for(int j = 0;j<k;j++)
			sum = sum + arr[j];
		System.out.println(sum);
	}
}