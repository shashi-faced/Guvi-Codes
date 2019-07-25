import java.util.Scanner;
import java.util.*;

public class check15
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int flag = 0;
		for(int i = n+1;i<k;i++)
		{
		  if(i%2 == 0)
		   {
		    System.out.print(i+" ");
	       }
		}	
	}
}