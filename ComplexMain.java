import java.util.Scanner;
class Complex
{
	int real;
	int imaginary;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		imaginary=sc.nextInt();
	}
	void add(Complex c1,Complex c2)
	{
		real=c1.real+c2.real;
		imaginary=c1.imaginary+c2.imaginary;
		
	}
	void display()
	{
		System.out.println("Sum:"+real+"+"+imaginary+"i");
	}
}
public class ComplexMain {

	public static void main(String[] args) 
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		c1.input();
		c2.input();
		c3.add(c1,c2);
		c3.display();
				

	}

}
