
public class PrintN {

	public static void main(String[] args) 
	{
		PrintN pri = new PrintN();
		pri.print();
				

	}

	public void print() 
	{
		for(int row = 1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(col==1 || col==row || col == 5)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
			    }
			}
			System.out.println();
		}
	}
}
