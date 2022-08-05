
public class Row {
	public static void main(String[] args) 
	{
		Row ro = new Row();
		ro.col();
		
		
	}
    public  void col() 
//    {
//		for(int row=1;row<=5;row++)
//		{
//			for(int col= 1;col<=6-row;col++ )
//			{
//				System.out.print( col+ "  ");
//			}
//			System.out.println();
//		}
//		
//	}
    {
    for(int row=1;row<=5;row++)
    {
    	for(int col=1;col<=5 - row ;col++)
    	{
    		System.out.print("  ");
    	}
    	for(int star=1;star<=row;star++)
    	{
    		System.out.print("  "+row+" ");
    	}
    	System.out.println();
    }

}
}
