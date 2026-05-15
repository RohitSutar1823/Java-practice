
public class Array2D {

	public static void main(String[] args) 
	{
		int [][]flats=new int[2][3];
		flats[0][0]=101;
		
		for(int i=0;i<2;i++)
		{
				for(int j=0;j<3;j++)
				{
					System.out.printf("%d\t",flats[i][j]);
				}
				System.out.printf("\n");
		}
		
		

	}

}
