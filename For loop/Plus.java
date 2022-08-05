
public class Plus {

	public static void main(String[] args) {
		Plus pl = new Plus();
		pl.add();
		
		
	}

	public void add()
	{
		int a = 5;
//      int b = 1;
		int c = 0;
//		while(b<=a)
//		{
//			c = c + (b * b);
//			b++;
//		}
//		System.out.println("addition number  "  + c);
		// for loop 
		for(int b = 1; b <= a; b++) 
		{
			c = c + (b * b);
		}
		System.out.println("addition number  "  + c);
	}

}
