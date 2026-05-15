import java.util.Scanner;
public class Input {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		float a=sc.nextFloat();
		System.out.println("Enter number:");
		int b=sc.nextInt();
		float sum=a+b;
		System.out.println(sum);
		String str=sc.nextLine();
		System.out.println(str);
	}

}
