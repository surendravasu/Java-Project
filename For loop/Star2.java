
public class Star2 {
	public static void main(String[] args) {
		Star2 str = new Star2();
		str.star();
	}

	private void star() 
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++ )
			{ 
				if(col==1  ||  col==5 || col==row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int space=3;space>=row;space--)
			{
				System.out.print("  ");
			}
			if(row!=5)
			System.out.print("*");
			System.out.println();
		}
	}
}
