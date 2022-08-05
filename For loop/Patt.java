
public class Patt {
	public static void main(String[] args) {
		Patt pa = new Patt();
		pa.pat();
	}

	public void pat()
	{

	for(int row=1 ;row<=5 ;row++ )
	{
		for(int col=1;col<=6-row;col++)
		{
			System.out.print(col + " ");
		}
		System.out.println();
		
	}
//		for(int row=1;row<=5;row++)
//		{
//			for(int col=5;col>=6-row;col--)
//			{
//				System.out.print (col + " ");
//			}
//			System.out.println();
//		}
//	{
//	for(int col=1;col<=5;col++)
//	{
//		System.out.print(1 + " ");
//	}
//	
//}
}
}
