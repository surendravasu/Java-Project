import java.util.Scanner;

public class Palindrome {
	static int b;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		b =sc.nextInt();
		sc.close();
		Palindrome pa = new Palindrome();
		pa.pal();

	}

	public void pal() {
		int no = b;
	    int c;
		int rev = 0;
		for(;b>0;)
		{
			c = b % 10;
			rev = (rev * 10) + c;
			b = b / 10;
			
		}
		if(no == rev)
		{
			System.out.println("palindrome" + rev);
		}
		else
		{
			System.out.println("not palindrome" +rev);
		}
		
	}

}
