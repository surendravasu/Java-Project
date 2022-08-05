import java.util.Scanner;

public class printZ {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		sc.close();
		printZ pri = new printZ();
		pri.print(no);
	}

	public void print(int no) 
	{
		int inc = 1, dec = no;
		for(int row=1;row<=no;row++)
		{
			for(int col=1;col<=no;col++)
			{
//				if(row==1 || row==5)
//				{
//					System.out.print("* ");
//				}
//				else if((row==2 && col==4))
//                {
//	              System.out.print("* ");
//                }
//				else if((row==3 && col==3))
//				{
//					System.out.print("* ");
//				}
//				else if((row==4 && col==2))
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
				if(row == 1 || row == no) {
					System.out.print("* ");
				}
				else if(row == inc && col == dec) {
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			inc++;
			dec--;
			System.out.println();
		}
		
	}

}
