class Phone
{
	void showTime()
	{
		System.out.println("It is 8am");
	}
	void On()
	{
		System.out.println("Turning on Phone...");
	}

}
class SmartPhone extends Phone
{
	void music()
	{
		System.out.println("Playing Music");
	}
	void On()
	{
		System.out.println("Turning SmartPhone On...");
	}
}
public class Dynamicmethoddispatch {

	public static void main(String[] args) 
	{
		//Phone obj=new Phone();
		//SmartPhone obj=new SmartPhone();
		Phone obj=new SmartPhone();		
		obj.showTime();
		obj.On();
		

	}

}
