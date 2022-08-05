
public class Draw {
	public static void main(String[] args) {
		Draw dr = new Draw();
		dr.dra();
	}

	public void dra() 
	{
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print("  ");
			}
			for(int at=5;at>row;at--)
			{
				System.out.print("* ");
			}
			for(int col=1;col<row;col++)
			{
				System.out.print("  ");
			}
			for(int at=5;at>row;at--)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}

		
	}

}
