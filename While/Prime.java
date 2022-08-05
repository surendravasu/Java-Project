import java.util.Scanner;

public class Prime 
{
	static int a = 1;

	public static void main(String[] args) 
	{
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		no = sc.nextInt();
		sc.close();
		Prime pri = new Prime();
		pri.Find_prime(no);
	}

	public void Find_prime(int no)
	{
		int count = 0;
		while( no >= a )
		{
			if( no % a == 0 )
			{
				count++;
			}
			a++;
		}
		if(count  == 2)
		{
			System.out.println(no + " Prime number ");
		}
		else
		{
			System.out.println(no + " Not prime number " );
		}
	}
}
