import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class check23
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = a;i<=b;i++)
		{
			int res = check(i);
			if(res == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	
	public static int check(int n)
	{
		int flag = 0;
		for(int j = 2;j<(n/2)+1;j++)
		{
			if(n%j == 0)
			{
				flag++;
			}
		}
		return flag;
	}
}