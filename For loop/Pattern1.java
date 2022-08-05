import java.util.Scanner;
public class Pattern1 {
	public static void main(String args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.close();
		Pattern1 pat = new Pattern1();
		pat.pattern(n);
	}

	public void pattern(int n) 
	{
		System.out.println("this is pattern");
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print(j + "  ");
//			}
//			System.out.println();
//		}
		
	}

}
