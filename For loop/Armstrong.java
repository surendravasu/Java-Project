
public class Armstrong {
	
	public static void main(String[] args) {
		Armstrong arm = new Armstrong();
		arm.arms();
	}

	private void arms() {
		// TODO Auto-generated method stub
		int a = 1634;
		int n = a;
		int b = 0;
		double c = 0;
		int digit;
		for (digit = 0;n>0;digit++)
		{
			b = n % 10;
			n = n / 10;
		}
		for (;a>0;)
		{
			b = a % 10;
			a = a / 10;
			c = c + Math.pow(b, digit);
			System.out.println("Armstrong number is "  + c);
		}
		
		
		
	}

}
