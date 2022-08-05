import java.util.Scanner;

public class Perfect {
	static int b;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		b = scanner.nextInt();
		scanner.close();
		Perfect per = new Perfect();
		per.fect();
	}

	public void fect() {
		// TODO Auto-generated method stub
		int a;
		int c = 0;
		for(a = 1;a<b;a++)
		{
			if(b % a == 0)
			c = c + a;
	    }
		if (b == c)
		{
			System.out.println("Perfect number  "  + b);
		}
		else
		{
			System.out.println("not Perfect number   "  + b);
		}
		
		
	}

}
