class base1
{
	base1()
	{
		System.out.println("I am a constructor");
	}
	base1(int x)
	{
		System.out.println("I am a constructor with value of x:"+x);
	}
}
class derived1 extends base1
{
	derived1()
	{
		System.out.println("I am a derived constructor");
	}
	derived1(int x,int y)
	{
		super(x);
		System.out.println("I am a constructor with value of y:"+y);
	}
}
class childofderived extends derived1
{
	childofderived()
	{
		System.out.println("I am a childofderived constructor");
	}
	childofderived(int x,int y,int z)
	{
		super(x,y);
		System.out.println("I am a constructor with value of z:"+z);
		
	}
	
}
public class Constructori_Inheritance {

	public static void main(String[] args) 
	{
		//base1 b=new base1();
		//derived1 d=new derived1(1,2);
		childofderived cd=new childofderived(1,2,3); 
		
		

	}

}
