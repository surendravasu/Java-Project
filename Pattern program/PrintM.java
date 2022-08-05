import java.util.Scanner;

public class PrintM {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		sc.close();
	    PrintM pri = new PrintM();
		pri.print(no);
	}

	public void print(int no) 
	{
		//int a = 1, dec = no;
		for(int row = 1; row<=no; row++)
		{
			for(int col=1; col<=no;col++)
			{
				if(col==1 || col==5)
				{
					System.out.print("* ");
				}
				else if(row==2 && (col==2 || col==4))
				{
					System.out.print("* ");
				}
				else if(row==3 && col==3)
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
		

