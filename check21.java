import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class check21
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] arr = str.split("");
		int k = 1;
		for(int i = 0;i<=arr.length-1;++i)
		{
			if(k<arr.length || i< arr.length)
			{
			System.out.print(arr[k]);
			System.out.print(arr[i]);
			k = k+2;
			i++;
			}
		}
	}
}