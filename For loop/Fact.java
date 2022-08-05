
public class Fact {
	
	
	public static void main(String[] args) {
		Fact fat = new Fact();
		fat.fact();
		
	}

	public void fact() {
		
		int b = 1;
		int c = 1;
		
		for (int i=10;b<=i;b++)
		{
			c = c * b;
		    System.out.println("10 Factorial is  "  + c);
		}
		
	}
	

}
