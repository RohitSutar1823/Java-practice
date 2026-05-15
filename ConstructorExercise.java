class Cylinder
{
	private int radius;
	private int height;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double surfacearea()
	{
		return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	}
	public double Volume()
	{
		return Math.PI*radius*radius*height;
	}
	public Cylinder(int radius,int height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	
}
class Rectangle
{
	private int length;
	private int breadth;
	public Rectangle() {
		this.length = 4;
		this.breadth = 5;
		
}
	public Rectangle(int length, int breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	
}
public class ConstructorExercise {

	public static void main(String[] args) 
	{
		//Cylinder cylinder=new Cylinder(5,7);
		//cylinder.setRadius(5);
		//System.out.println(cylinder.getRadius());
		//cylinder.setHeight(6);
		//System.out.println(cylinder.getHeight());
		//System.out.println(cylinder.surfacearea());
		//System.out.println(cylinder.Volume());
		Rectangle r=new Rectangle(324,235);
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
	

	}

}
