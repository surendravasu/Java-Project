
public class column {
	public static void main(String[] args) {
		column co = new column();
		co.col();
		
	}

	private void col() 
	{
		for(int row=1; row<=7; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if((row==1 ||row==2  || row==3|| row==5|| row==6 || row==7) && (col==2 || col == 3 || col == 4))
				{
					System.out.print("   ");
				} 
				else 
				{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
		}
		
	}
//	{
//	for(int row=1; row<=6; row++)
//	{
//		for(int col=1;col<=5;col++)
//		{
//			if(row==2 || row==3 || row==5 || row==6)
//			{
//				if(col==1 || col==5) 
//				{
//					System.out.print("*  ");
//				}
//				else
//				{
//					System.out.print("   ");
//				}
//			}
//			else
//			{
//				System.out.print("*  ");
//			}
//		}
//					
//		System.out.println();
//	}
//}



