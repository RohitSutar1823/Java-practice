class MyEmployee
{
	private int id;
	private String name;
	void setid(int n)
	{
		id=n;
	}
	int getid()
	{
		return id;
	}
}
public class Practice_class {

	public static void main(String[] args) 
	{
		MyEmployee harry=new MyEmployee();
		harry.setid(67);
		System.out.println(harry.getid());
	}

}
