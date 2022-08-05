
public class Two 
{
	public static void main(String[] args) 
	{
		Two matrix = new Two();
		matrix.Find_Matrix();
		matrix.two();
	}

	private void Find_Matrix() 
	{
		int a[][] = {{1,6} , {4,4}};
		int b[][] = {{4,3} , {2,8}};
		int c[][] = new int[2][2];
		int row = 0;
		int col = 0;
		for(row = 0; row < a.length; row++)
		{
			for(col = 0; col < a[row].length; col++)
			{
				c[row][col] = a[row][col] + b[row][col];
				System.out.print(c [row][col] + " ");
			}
			System.out.println();
		}
	}
	
	private void two()
	{
		System.out.println(" ");
		int a[][] = {{2,3,4},{3,7,8}};
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
	}

}
