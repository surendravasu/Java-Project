
public class Spiral 
{
	public static void main(String[] args) 
	{
		Spiral spy = new Spiral();
		spy.matrix();
	}

	private void matrix() 
	{
		int result[][] = new int [4][4];
		int min_row = 0 , max_row = 3, min_col = 0, max_col = 3;
		int val = 1;
		for(int col = min_col; col<=max_col; col++)
		{
			result [min_row][col] = val;
			val++;
		}
		min_row++;
		for(int row = min_row; row<=max_col; row++)
		{
			result [row][max_col] = val;
			val++;
		}
		for(int col = max_col-1; col>=0; col--)
		{
			result [max_row][col] = val;
			val++;
		}
		for(int row = max_row-1; row>=1; row--)
		{
			result [row][min_col] = val;
			val++;
		}
		for(int col = min_col+1; col<=2; col++)
		{
			result [min_row][col] = val;
			val++;
		}
		min_row++;
		for(int row = min_row; row<=max_row-1; row++)
		{
			result [row][max_col-1] = val;
			val++;
		}
		for(int row = min_row; row<=max_row-1; row++)
		{
			result [row][max_col-2] = val;
			val++;
		}
		for(int row = 0; row < result.length; row++)
		{
			for(int col = 0; col < result[row].length; col++)
			{
				System.out.print(result [row][col] + " ");
			} 
			System.out.println("\n");
		}
		
	}

}
