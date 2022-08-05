
public class Fibbnosis {
	public static void main(String[] args) {
		Fibbnosis fib = new Fibbnosis();
		fib.fi();
	}

	public void fi() {
		int a = 0;
		int b = 1;
		int c = 1;
		int temp;
		System.out.println("Enter the value   "  +a);
		System.out.println("Enter the value   "  +b);
		while(c<=5) 
		{
			 temp = a + b;
			 System.out.println("Enter the value   "  + temp);		
			 a = b;
			 b = temp;
			 c++;
		}
	}

}
