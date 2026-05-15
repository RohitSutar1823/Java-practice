import java.util.Scanner;
import java.util.Arrays;
public class Median {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		if(n%2==1)
		{
			System.out.println("Median"+(a[n/2]));
		}
		else
		{
			System.out.println("Median"+((a[n/2]+a[n/2-1])/2.0));
		}
		

	}

}
