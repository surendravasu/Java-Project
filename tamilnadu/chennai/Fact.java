package tamilnadu.chennai;

public class Fact {
	public static void main(String[] args) {
		Fact fa = new Fact();
		fa.fact();
	}

	public void fact() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 1;
		int c = 1;
		while(b<=a)
		{
			// System.out.println("Factorial");
			c = c * b;
			b++;
		}
			
		System.out.println(a + " factorial is: " + c);
	}
	

}
