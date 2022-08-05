import java.util.Scanner;

public class Prime {
	static int i = 2;
	static int n= 30;
	static boolean isprime = true;
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  A value  "  );
		a = sc.nextInt();
		System.out.println("Enter the  B value  "  );
		b = sc.nextInt();*/
		Prime pr = new Prime();
		pr.pri();
		
		
		
		
	}
	public void pri() {
		// TODO Auto-generated method stub
		while(i < n)
		{
			if(n % i == 0)
			{
			isprime = false;
			break;
			}
			i++;
		}
		if(isprime)
		{
			System.out.println("this is prime");
		}
		else
		{
         System.out.println("this is not prime");
		}
		
		
		
	}
}


