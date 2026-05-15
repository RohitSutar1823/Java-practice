class A
{
	int a;
	public void meth2()
	{
		System.out.println("I am method of class A");
		
	}
}
class B extends A
{
	public void meth3()
	{
		System.out.println("I am method of class B");
	}
}
public class Methodoverriding {

	public static void main(String[] args) 
	{
		B obj =new B();
		obj.meth3();
		

	}

}
