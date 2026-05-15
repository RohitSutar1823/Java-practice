class MyEmployee
{
	private int id;
	private String name;
	public MyEmployee(String myname,int myid)
	{
		id=myid;
		this.name=myname;
	}
	void setid(int n)
	{
		id=n;
	}
	int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
}
public class GettersSetters {

	public static void main(String[] args) 
	{
		MyEmployee harry=new MyEmployee("CodewithHarry",12);
		//harry.setid(67);
		System.out.println(harry.getid());
		System.out.println(harry.getname());
	}

}
