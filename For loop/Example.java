import java.util.Scanner;
public class Example {
   

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int n = sc.nextInt();
	    sc.close();
	    Example ne = new Example();
		ne.fact(n);
		
		
		
	}

	public void fact(int n) 
	{
		int f = 1;
		for(int i = 1;i<=n;i++)
		{
			f = f * i;
		}
		
		System.out.println("Enter the Factorial  " + n + " is  " + f);
		
		
	}
	
}
