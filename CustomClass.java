class Employee
{
	int id;
	String name;
	int salary;
	public void printDetails()
	{
		System.out.println("My id is "+id);
		System.out.println("My name is  "+name);
	}
	public void getsalary()
	{
		System.out.println(salary);
	}
}
public class CustomClass {

	public static void main(String[] args)
	{
		Employee harry=new Employee();
		harry.id=12;
		harry.name="Harry";
		harry.printDetails();
		Employee john=new Employee();
		john.id=17;
		john.name="john";
		john.printDetails();
		john.salary=23423;
		john.getsalary();

	}

}
