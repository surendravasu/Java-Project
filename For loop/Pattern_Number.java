import java.util.Scanner;
public class Pattern_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		scanner.close();
	    Pattern_Number patt = new Pattern_Number();
	    patt.number(n);
	}

	public void number(int n) 
	{
		int k = 1;
		for (int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
	}

}
