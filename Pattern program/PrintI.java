
public class PrintI {
	public static void main(String[] args) {
		
		PrintI pri = new PrintI();
		pri.print();
		
	}

	private void print() 
	{
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if(row==1 || row==5)
				{
					System.out.print("* ");
				}
				else if((row==2 || row==3 || row==4) && col==3)
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
