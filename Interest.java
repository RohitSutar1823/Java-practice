import java.util.Scanner;
public class Interest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		Double SI=(p*r*t)/100.0;
		Double CI=p*Math.pow(1+r/100.0, t)-p;
		System.out.println("Simple Interest is:"+SI);
		System.out.println("Compound Interest is:"+CI);

	}

}
