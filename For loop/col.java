
public class col {
	public static void main(String[] args) 
	{
		col co = new col();
		co.row();
		
		
	}

	public void row() 
	{
		for(int col=1;col<=5;col++)
		{
			if(col==1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*  ");
			}
		}
		System.out.println();
		for(int row = 1;row<=5;row++)
		{
			System.out.println("*");
		}
		for(int col=1;col<=5;col++)
		{
			if(col==1)
			{
				System.out.print  (" ");
			}
			else
			{
				System.out.print("*  ");
			}
		}
		
	}

}
