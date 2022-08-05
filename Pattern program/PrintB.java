
public class PrintB 
{
	public static void main(String[] args) 
	{
		PrintB pri = new PrintB();
		pri.print();
	}
	public void print()
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
			    if((row==1 || row==3 || row==5) && (col==1 || col==2 || col==3 || col==4))
			    {
			    	System.out.print("* ");
			    }
			    else if((row==2 || row==4) && (col==1 || col==5))
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
			    
