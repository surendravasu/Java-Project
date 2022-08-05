import java.util.Scanner;

public class Neon {
	static int a;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();
		Neon ne = new Neon();
		ne.neo();

	}

	public void neo() {


		int no = a;
		int c = 0;
		a = a * a;
		while (a > 0)
		{
			c = c + (a % 10);
			a =(a / 10);
		}
		if (no == c)
		{
			System.out.println("is neon number");
		}
		else
		{
			System.out.println("is not neon number");
		}
	}

}
