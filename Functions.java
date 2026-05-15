import java.util.Scanner;
public class Functions
	{
		static int sum(int a,int b)
		{
			int c=a+b;
			return c;
		}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sum(a,b);
			System.out.println(c);
		
		

	}

	}}
