import java.util.Scanner;
import java.util.*;

public class check13
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int i = 2;i<(n/2);i++)
		{
		  if(n%i == 0)
		   {
		    flag++;
	       }
		}
		
		if(flag == 0)
			System.out.println("yes");
		else
			System.out.println("no");	
	}
}