import java.util.Scanner;
public class Dpattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = sc.nextInt();
		System.out.println("Enter the column");
		int col = sc.nextInt();
		sc.close();
		Dpattern patt = new Dpattern();
		patt.pattern(row,col);
		
	}

	private void pattern(int row,int col) 
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i != row && j==1) 
				{
					System.out.print("* ");
				}
				else if(i == row)
				{
					System.out.print("* ");
				}
				else if(i==row && j!=1)
				{
					System.out.println("  ");
				}
			}
			System.out.println();	
		}
	}	
}