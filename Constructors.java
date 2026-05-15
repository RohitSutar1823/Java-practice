class MyMainEmployee
	{
		private int id;
		private String name;
	
	public MyMainEmployee(String myname,int myid)
	{
		name=myname;
		id=myid;
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
	}
}
public class Constructors 
{
	
	public static void main(String[] args)
	{
		MyMainEmployee harry=new MyMainEmployee("Codewithharry",45);
		harry.display();

	}

}
