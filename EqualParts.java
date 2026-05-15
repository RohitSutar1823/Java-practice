
public class EqualParts {

	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int Firstpart=num/100;
		int Secondpart=num%100;
		if(Firstpart==Secondpart)
		{
			System.out.println("Two digit parts are equal");
		}
		else
		{
			System.out.println("Two digit parts are not equal");
		}

	}

}
