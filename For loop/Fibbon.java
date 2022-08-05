import java.util.Scanner;

public class Fibbon {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		sc.close();
		Fibbon fi = new Fibbon();
		fi.fibon(no);
	}

	private void fibon(int no) 
	{
		int a = -1;
		int b = 1;
		int c;
		for(int i = 1;i<=no;i++)
		{
			c = a + b;
			System.out.println("Fibbonacci number  "  + c);
			boolean result = findprime(c);
			if (result) 
			{
				System.out.println("prime number  " + c);
			}
			else
			{
				System.out.println("not prime number  "  + c);
			}
			a = b;
			b = c;
		}
		
		
		
	}

	private boolean findprime(int c) 
	{
		boolean isprime = true;
		for (int i=2;i<c;i++)
		{
			if(c % i == 0)
			{
				isprime = false;
				break;
			}
		}
		return isprime;
	}

}
