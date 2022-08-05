import java.util.Scanner;
public class Pattern {
	public static void main(String args[] )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int no = sc.nextInt();
		sc.close();
		Pattern pat = new Pattern();
		pat.pa(no);
	
	}

     public void pa(int no) 
	{
		for(int i=no;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}

}
