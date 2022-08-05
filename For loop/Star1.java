
public class Star1 {
	public static void main(String[] args) {
		Star1 star = new Star1();
		star.st();
		star.st();
		star.st();
		
		
	}
	public void st()
	
	{
		int col;
		for (int row=1;row<=5;row++)
		{
			for(col=1;col<= 5-row;col++)
			{
				System.out.print(" "+ " ");
			}
			for(int star=1;star<=row;star++)
			{
			System.out.print("  "+col+" ");
			}
			System.out.println();
	}
	

}
}
