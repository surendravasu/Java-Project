
public class Palindrome {
	
	
	public static void main(String[] args) {
		Palindrome pa = new Palindrome();
		pa.pal();
		
	}

	public void pal() {
		// TODO Auto-generated method stub
		int no = 120;
		int no1 = no;
		int rev = 0;
		int rem;
		while (no > 0)
		{
			rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		if(rev == no1)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	

}
