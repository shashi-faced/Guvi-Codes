import java.util.Scanner;
import java.util.*;


public class check3
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
        
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
}		
}