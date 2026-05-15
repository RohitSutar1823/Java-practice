import java.util.Scanner;
class Employee
{
	String name;
	int ec;
	int salary;
	void input(String s,int ec,int salary)
	{
		name=s;
		this.ec=ec;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(name+" "+ec+" "+salary+" ");
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Employee e[]=new Employee[50];
		for(int i=0;i<2;i++)
		{
			e[i]=new Employee();
			System.out.println("Enter name,employee code,salary");
			String name=sc.next();
			int code=sc.nextInt();
			int salary=sc.nextInt();
			e[i].input(name,code,salary);
		}
		
		for(int i=0;i<2;i++)
		{
			e[i].display();
		}
	}

}
