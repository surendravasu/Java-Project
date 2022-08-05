import java.util.Scanner;
public class Number {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int no = sc.nextInt();
		sc.close();
		Number num = new Number();
		num.nu(no);
	}

	public void nu(int no) 
	{
		for(int i=1;i<=no;i++)
		{
			for (int j=1;j<=i;j++)
			{
			System.out.print(i);
		    }
			System.out.println();
	    }
    }

}
		
		
		
		
		
		
		
		
		
		
		

		
		

		

//		int no = 5;
//		int a = no;
//
//		for(int i=1;i<=no;i++)
//		{
//			for(int col=1;col<=i;col++)
//			{
//				System.out.print(col + " ");
//			}
//			System.out.println();
//			
//		}
//		System.out.println("---------------------");
//		output:
//		1
//		12
//		123
//		1234
//		12345

//		for(int i=no;i>=1;i--)
//		{
//			for(int col=1;col<=i;col++)
//			{
//				System.out.print(col + " ");
//			}
//			System.out.println();
//			
//		}
//		output:
//		12345
//		1234
//		123
//		12
//		1
		
		

