import java.util.Scanner;
public class Nest {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Nest nt = new Nest();
		nt.next(n);
	}

	private void next(int n) 
	{
//		int no = 1;
//		//while (no<=n)
//			for(no =1;no<=n;no++)
//		{
//			for (int i =1;i<=n;i++)
//			{
//				System.out.print(no+"  ");
//			}
//			System.out.println();
//			//no++;
//		}
//			
		    //int no1 = 1;
//			int col = 1;
//			for (col = 1;col<=5;col++)
//			{
//				System.out.print(no1 + "  ");
//			}
//			no1++;
//			for (col = 6; col <=10;col++)
//			{
//				System.out.print(no1 + "  ");
//			}
//			no1++;
//			for(col = 11; col <=15;col++)
//			{
//				System.out.print(no1 + "  ");
//			}
			
//		    int no1 = 1;
//			int col = 1;
//			for (col=1;col<=15;col++)
//			{
//				System.out.print(no1 + "  ");
//				if(col == 5)
//				{
//					no1++;
//				}
//				if(col == 10)
//				{
//					no1++;
//				}
//			}
		int no1 = 1;
		int col = 1;
		for (col = 1;col <=10;col++)
		{
			System.out.print(no1 + "  ");
			if(col%3==0)
			{
				no1++;
				System.out.println();
			}
		}
		
		
		
//		for (int i=1;i<=n;i++)
//		{
//			System.out.print(1+"  ");
//		}
//		System.out.println();
//		for (int i=1;i<=n;i++)
//		{
//			System.out.print(2+"  ");
//		}
//		System.out.println();
//		for(int i=1;i<=n;i++)
//		{
//			System.out.print(3+"  ");
//		}
		
	}

}
