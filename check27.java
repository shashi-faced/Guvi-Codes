import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class check27
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
			if(check(arr[j],arr) != true)
		       System.out.print(arr[j]);
	}
	public static boolean check(int n,int arr[])
	{
		int count = 0;
		for(int k = 0;k<arr.length;k++)
		{
			if(arr[k] == n)
				count++;
		}
		if(count > 1)
			return true;
		else
			return false;
	}
}