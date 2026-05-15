import java.util.Scanner;
public class ReplaceChar {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("Enter character to replace:");
		char oldchar=sc.next().charAt(0);
		System.out.println("Enter new character:");
		char newchar=sc.next().charAt(0);
		String result=str.replace(oldchar, newchar);
		System.out.println("New String: "+result);
		
		
		

	}

}
