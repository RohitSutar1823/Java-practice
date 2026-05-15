class base
{
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
class derived extends base
{
	int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

public class Inheritance {

	public static void main(String[] args) 
	{
		base b=new base();
		b.setX(2);
		System.out.println(b.getX());
		derived d=new derived();
		d.setX(5);
		System.out.println(d.getX());
		d.setY(2);
		System.out.println(d.getY());

	}

}
