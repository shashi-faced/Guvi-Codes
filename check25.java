import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class check25
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
		Arrays.sort(arr);
		int count = 0;
		for(int k = 0;k<arr.length;k++)
		if(arr[k] == 0)
			count++;
		if(count == arr.length)
			System.out.println("0");
		else
		for(int j = arr.length-1;j>=0;j--)
		System.out.print(arr[j]);
	}
}