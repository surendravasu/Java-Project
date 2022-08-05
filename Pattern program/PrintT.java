
public class PrintT 
{
public static void main(String[] args) 
{
	PrintT pri = new PrintT();
	pri.print();
}

private void print() 
{
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
//			if(row==1 && (col==1 || col==2 || col==3 || col==4 || col==5))
//			{
//				System.out.print("* ");
//			}
//			else if((row==2 || row==3 || row==4 || row==5) && col==3)
//			{
//				System.out.print("* ");
//			}
//			else
//			{
//				System.out.print("  ");
//			}
			if(row==1)
			{
				System.out.print("* ");
			}
			else if(row!=1 && col==3)
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
