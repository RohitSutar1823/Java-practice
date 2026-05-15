class Thread1 extends Thread
{
	Thread1(String name)
	{
		super(name);
	}
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thank you"+getName());
		/*while(true)
		System.out.println("Running task 1");*/
		
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Running task 2");
	/*	while(true)
		{
			System.out.println("Running task 2");
		}*/
		
	}
}

public class Threading {

	public static void main(String[] args)
	{
		Thread1 t1=new Thread1("Harry1");
		Thread1 t2=new Thread1("Harry2");
		Thread1 t3=new Thread1("Harry3");
		Thread1 t4=new Thread1("Harry4");
		Thread2 t5=new Thread2();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}


}
