import java.util.Scanner;
public class RemoveSpaces {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String result=str.replaceAll(" ","");
		System.out.println("String without backspaces: "+result);
		

	}

}
