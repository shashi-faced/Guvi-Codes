import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class check26
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int j = 0;j<n;j++)
			if(j == arr[j])
		System.out.print(arr[j]+" ");
	}
}