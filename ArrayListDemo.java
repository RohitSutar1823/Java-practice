import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(1,0);
		l1.add(1,5);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i)+","+ " ");
		}
		System.out.println();
		for(int i=0;i<l2.size();i++)
		{
			System.out.print(l2.get(i)+","+ " ");
		}
		System.out.println();
		l1.addAll(1,l2);
		l1.set(6,1);
		l1.remove(0);
		for(int i=0;i<l1.size();i++)
		{
			System.out.print(l1.get(i)+","+ " ");
		}
		System.out.println();
		System.out.println(l1.contains(5));
		System.out.println(l1.size());
		System.out.println(l1.indexOf(4));




	}

}
