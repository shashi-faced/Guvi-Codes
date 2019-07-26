import java.util.Scanner;
import java.lang.*;
public class check19{  
public static void main(String[] args) 
{  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int ans = 1;
	for(int i = n;i>0;i--)
	{
		ans = ans*i;
	}
    System.out.println(ans);       
    }  
} 