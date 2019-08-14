//Hash Map
import java.util.HashMap;
import java.util.Scanner;

public class check28
{
	public static void main(String []args)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size  ");
		int n = sc.nextInt();
		for(int i  = 0;i<n;i++)
		{
			int num = sc.nextInt();
			if(map.containsKey(num))
			{
				System.out.println(num);
				break;
			}
			else
			{
				map.put(num,1);
			}
		}
	
	}
}