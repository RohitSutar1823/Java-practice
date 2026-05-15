import java.util.Scanner;
public class Recursion
{
		static long factorial(int n)
		{
			if(n==0||n==1)
			{
				return 1;
			}
			else
			{
				return n*factorial(n-1);
			}
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=4;
		System.out.println("The factorial of "+n+" is "+factorial(n));
	}

}
