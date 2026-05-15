import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("1.add 2.sub 3.mul 4.div 5.Exit");
			int choice=sc.nextInt();
			if(choice==5) 
				{
				System.out.println("Exit");break;
				}
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println(a+b);break;
			case 2:System.out.println(a-b);break;
			case 3:System.out.println(a*b);break;
			case 4:System.out.println(a/b);break;
			default:System.out.println("Invalid Choice");
			
			
			}
		}

	}

}
