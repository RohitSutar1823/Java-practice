import java.util.Scanner;
public class Percentage {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		float a=sc.nextInt();
		float b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		float percentage=((a+b+c+d+e)/500)*100;
		System.out.println(percentage);
		
		
		
		}

}
