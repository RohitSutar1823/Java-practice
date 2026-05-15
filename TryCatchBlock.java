import java.util.Scanner;
public class TryCatchBlock {

	public static void main(String[] args) 
	{
		int []marks=new int[3];
		marks[0]=56;
		marks[1]=100;
		marks[2]=150;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to see value:");
		int a=sc.nextInt();
		System.out.println("Enter value to divide with:");
		int b=sc.nextInt();
		try {
		System.out.println("The value at index is "+marks[a]);
		System.out.println("The value divided by number is:"+marks[a]/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occured");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayOutOfBoundsException occured");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured,reason");
			System.out.println(e);
		}
		System.out.println("End of program");
		
	}

}
